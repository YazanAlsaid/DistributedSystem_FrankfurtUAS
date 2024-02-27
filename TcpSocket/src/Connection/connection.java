package Connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class connection extends Thread{

    DataOutputStream os;
    DataInputStream is;
    Socket clientSocket;

    public connection(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
        os = new DataOutputStream(clientSocket.getOutputStream());
        is = new DataInputStream(clientSocket.getInputStream());
        this.start();
    }

    @Override
    public void run() {
        try {
            String data = is.readUTF();
            System.out.println("from client to server : "+data);
            os.writeUTF(data);
            System.out.println("data has been sent again from server to client : "+data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
