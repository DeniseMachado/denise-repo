package org.academiadecodigo.stringrays.uppercase;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {

    public static void main(String[] args) {


        DatagramSocket socket = null;


        String hostName = "localhost";
        int porNumber = 19000;

        try {
            socket = new DatagramSocket(18000);

            byte[] receive = new byte[1024];

            DatagramPacket receivePack = new DatagramPacket(receive, receive.length);
            socket.receive(receivePack);
            System.out.println(receivePack);

            byte[] send = new byte[1024];
            DatagramPacket sendPacket = new DatagramPacket(send, send.length,
                    InetAddress.getByName(hostName), porNumber);
            socket.send(sendPacket);
            socket.receive(receivePack);


        } catch (SocketException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            if (socket != null) {
                socket.close();
            }
        }

    }
}



