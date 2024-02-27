package Server;

import Client.Message;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyServer {

    static int myPort = 4467;
    static byte[] bytes = new byte[1000];

    public static void main(String[] args) {
       // while (true) {
            try {
                DatagramSocket socket = new DatagramSocket(myPort);
                DatagramPacket packetofReceive = new DatagramPacket(bytes, bytes.length);
                socket.receive(packetofReceive);

                ByteArrayInputStream b = new ByteArrayInputStream(bytes);
                ObjectInputStream o = new ObjectInputStream(b);
                Message message = (Message) o.readObject();

                System.out.println("data from client are received"+ message.getAccountName());

              /*  DatagramPacket packetOfSend = new DatagramPacket(packetofReceive.getData(),
                        packetofReceive.getLength(),
                        packetofReceive.getAddress(),
                        packetofReceive.getPort());
                socket.send(packetOfSend);

               */

                socket.close();
            } catch (IOException io) {
                System.out.println("Error : " + io.getMessage());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
   // }
}
