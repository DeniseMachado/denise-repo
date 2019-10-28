package org.academiadecodigo.stringrays.uppercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDPServer class that listens for UDP packets
 * and manipulates its content and retransmits them back to the sender
 */

public class UDPServer {

    private static final String CHARSET = "UTF-8";
    private int portNumber = 19000;

    /**
     * UDPServer entry point
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) {


        try {
            //creat a UDPServer object
            UDPServer udpServer = new UDPServer();

            //gets the port from the console
            udpServer.getUserInput();

            //start the udp server
            udpServer.start();

        } catch (NumberFormatException ex) {
            System.err.println("ERROR: Invalid port!");

        } catch (SocketException ex) {
            System.err.println("ERROR: Could not accept incoming packets: " + ex.getMessage());

        } catch (IOException ex) {
            System.err.println("ERROR: Network failure: " + ex.getMessage());
        }

    }

    //Wait for a client udp packet, process it and send it' content bacl to the sender
    private void start() throws IOException {

        DatagramSocket serverSocket = new DatagramSocket(portNumber);

        byte[] receiveData = new byte[1024];

        //isBound() returns the binding state of ServerSocket
        while (serverSocket.isBound()) {

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            System.out.println("Waiting for datagram packet");
            serverSocket.receive(receivePacket);

            String message = new String(receivePacket.getData(), 0, receivePacket.getLength(), CHARSET);

            InetAddress address = receivePacket.getAddress();
            int portNumber = receivePacket.getPort();
            System.out.println("From: " + address.getHostName() + ":" + portNumber);
            System.out.println("Message: " + message);

            String toUpperCase = message.toUpperCase();
            byte[] sendData = toUpperCase.getBytes(CHARSET);

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                    address, portNumber);
            serverSocket.send(sendPacket);

        }
    }

    private void getUserInput() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Port Number? ");
        portNumber = Integer.parseInt(in.readLine());

        in.close();
    }
}





