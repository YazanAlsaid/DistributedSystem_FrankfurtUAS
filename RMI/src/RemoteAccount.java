import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.List;

public interface RemoteAccount extends Remote {

    RemoteEntry findByAmount(double amount) throws RemoteException;
    void addEntry(String entryName, double amount, LocalDateTime dateOfTransaction) throws RemoteException;
    List<RemoteEntry> getEntries() throws RemoteException;
    String getName() throws RemoteException;
}
