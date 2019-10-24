package org.academiadecodigo.stringrays.uppercase;

import java.io.IOException;
import java.net.*;

public class Cliente {

    public static void main(String[] args) {


        DatagramSocket socket = null;

        String hostName = "localhost";
        int porNumber = 8000;

        try {
            socket = new DatagramSocket(9000);
            //byte[] bufferSend;
            String message = " Hello";
            byte[] bufferSend = message.getBytes();


            DatagramPacket sendPacket = new DatagramPacket(bufferSend, bufferSend.length,
                    InetAddress.getByName(hostName), porNumber);
            socket.send(sendPacket);


            byte[] receive = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receive, receive.length);

            socket.receive(receivePacket);

        } catch (SocketException exception) {

        } catch (UnknownHostException exception) {

        } catch (IOException exception) {

        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}




