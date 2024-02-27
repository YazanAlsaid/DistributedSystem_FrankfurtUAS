package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class myClients {
    static int clientPort = 1024 ;
    public static void main(String[] args) {





            try {
                InetAddress host = InetAddress.getByName("localhost");
                Socket client = new Socket(host, clientPort);
                while(true) {
                    Scanner in = new Scanner(System.in);
                    String data = in.nextLine();

                    DataOutputStream os = new DataOutputStream(client.getOutputStream());
                    os.writeUTF(data);
                    DataInputStream is = new DataInputStream(client.getInputStream());
                    String dataFromServer = is.readUTF();
                    System.out.println("client get message from sever back : " + dataFromServer);
                }
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

