import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDateTime;

public interface RemoteEntry extends Remote {

    void setAmount(double amount) throws RemoteException;
    String getEntryName() throws RemoteException;

    double getAmount() throws RemoteException;
    LocalDateTime getDate() throws RemoteException;
}
