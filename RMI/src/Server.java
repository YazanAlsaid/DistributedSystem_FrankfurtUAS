import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Server  extends UnicastRemoteObject{

    public Server() throws RemoteException{}
    public static void main(String[] args) throws RemoteException {
        try {

            AccountImp account1 = new AccountImp("yazan");
            Naming.rebind("yazan", account1); // Bind account1 to a name in the registry

            AccountImp account2 = new AccountImp("Mohammad");
            Naming.rebind("Mohammad", account2);

            System.out.println("Server started. you can run the client now");

        } catch (Exception e) {
            System.out.println("Server exception: " + e);
            e.printStackTrace();
        }
    }
}
