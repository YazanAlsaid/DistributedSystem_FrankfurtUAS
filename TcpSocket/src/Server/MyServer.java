package Server;

import Connection.connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    static int myPort = 1024;
    static ServerSocket ListenSocket;
    public static void main(String[] args) {
        try{
            System.out.println("Server ist schon ausgeführt");
            ListenSocket = new ServerSocket(myPort);
            while(true){
                Socket clientSocket = ListenSocket.accept();
                System.out.println("CONNECTED FROM SERVER "+clientSocket.getPort());
                /*
                was ich hier als Kommentar gestellt habe,habe ich mit der connection class ersetzt.
                ...............
                DataInputStream is = new DataInputStream(clientSocket.getInputStream());
                String data = is.readUTF();
                System.out.println(data);
                DataOutputStream os = new DataOutputStream(clientSocket.getOutputStream());
                os.writeUTF(data);
                System.out.println("it got back to client : "+data);

                 */
                connection conn = new connection(clientSocket);
            }

        }catch (IOException io){
            System.out.println("  Error : "+io.getMessage());
        }
    }
}
