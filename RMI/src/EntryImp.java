import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;

public class EntryImp extends UnicastRemoteObject implements RemoteEntry {

    private String EntryName;
    private LocalDateTime date;
    private double amount;

    public EntryImp() throws RemoteException {}

    public EntryImp(String EntryName, double amount, LocalDateTime date) throws RemoteException {
        this.EntryName = EntryName;
        this.amount = amount;
        this.date = date;
    }
    @Override
    public void setAmount(double amount) throws RemoteException {
        this.amount = amount;
    }
    @Override
    public String getEntryName() throws RemoteException {
        return this.EntryName;
    }
    @Override
    public double getAmount() throws RemoteException {
        return this.amount;
    }
    @Override
    public LocalDateTime getDate() throws RemoteException {
        return this.date;
    }
    @Override
    public String toString() {
        return "EntryImp{" +
                "EntryName='" + EntryName + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
