package org.academiadecodigo.stringrays.inetadress;

import java.io.IOException;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class HostName {

    private InetAddress ip;
    //private String hostName;


    public void getByName(String hostName) {

        try {
            ip = InetAddress.getByName(hostName);

            System.out.println(ip);
            System.out.println(ip.isReachable(1000));
        } catch (UnknownHostException e) {
            System.out.println("Could not find");
        } catch (IOException e) {

        }
    }

}

