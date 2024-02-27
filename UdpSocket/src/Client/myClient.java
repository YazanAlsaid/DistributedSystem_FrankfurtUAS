package Client;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.Scanner;

public class myClient {

    static int myPort = 4467;
    static byte[] bytes = new byte[1000];
    static String data = new String();
    static Object[] obj = new Object[10];
    static int i = 0;

    public static void main(String[] args) throws IOException {

      //  while(true) {

            Scanner in = new Scanner(System.in);
            data = in.nextLine();
            obj[i] = data;
            String accountName = "Yazan";
            String method = "12345";
        Message message = new Message(accountName,method,obj);

            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ObjectOutputStream o = new ObjectOutputStream(b);
            o.writeObject(message);
            byte [] byteOfData = b.toByteArray();
            try {
                DatagramSocket socket = new DatagramSocket();
                DatagramPacket packet = new DatagramPacket(byteOfData, byteOfData.length, InetAddress.getByName("localhost"), myPort);
                socket.send(packet);

                DatagramPacket packetToReceive = new DatagramPacket(bytes, bytes.length);
                socket.receive(packetToReceive);
                System.out.println("Data from server : " + new String(packetToReceive.getData(), 0, packet.getLength()));
                socket.close();
            } catch (UnknownHostException ue) {
                System.out.println(" Error :  " + ue.getMessage());
            } catch (SocketException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
      //  }

    }
}
