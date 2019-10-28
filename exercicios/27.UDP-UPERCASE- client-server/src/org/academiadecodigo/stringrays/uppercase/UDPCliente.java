package org.academiadecodigo.stringrays.uppercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * UDPCLient class that sends packets to a specific UDP host server and receives it's response
 */

public class UDPCliente {

    private static final int BUFFER_SIZE = 1024;
    private static final int RCV_TIMEOUT = 10000;
    private static final String CHARSET = "UTF8";

    private String hostName;
    private int portNumber;
    private String message;

    private DatagramSocket clientSocket;

    /**
     * UDPClient entry point
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) {

        UDPCliente udpCliente = new UDPCliente();
        udpCliente.start();

    }

    private void start() {

        try {


            //gewts the desired udp server host ip, port, and the message content from the console
            getUserInput();

            //sent the datagram poacket to the server
            sendDatagram();

            //receive a datagram packet from the server, dump to console and close socket
            receiveDatagram();

        } catch (UnknownHostException ex) {
            System.err.println("ERROR: Invalid host: " + this.hostName);

        } catch (NumberFormatException ex) {
            System.err.println("ERROR: Invalid port!");

        } catch (SocketException ex) {
            System.err.println("ERROR: Could not connect to server: " + this.hostName + ":" + this.portNumber);

        } catch (IOException ex) {
            System.err.println("ERROR: Network Failure: " + ex.getMessage());

        }

    }

    private void getUserInput() throws IOException, NumberFormatException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Host name? ");
        hostName = in.readLine();


        System.out.println("Port Number? ");
        portNumber = Integer.parseInt(in.readLine());


        System.out.println("Enter message: ");
        message = in.readLine();

        in.close();

    }


    private void sendDatagram() throws IOException {

        clientSocket = new DatagramSocket();
        InetAddress address = InetAddress.getByName(hostName);

        byte[] sendData = message.getBytes(CHARSET);

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                address, portNumber);
        clientSocket.send(sendPacket);

    }

    private void receiveDatagram() throws IOException {

        byte[] receiveData = new byte[BUFFER_SIZE];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        System.out.println("waiting for return packet");
        clientSocket.setSoTimeout(RCV_TIMEOUT);

        try {

            clientSocket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength(), CHARSET);

            System.out.println("Received Message: " + response);

        } catch (SocketException ex) {
            System.out.println("ERROR: Timeout Occurred, packet assumed lost");

        } finally {
            clientSocket.close();

        }
    }

}
