import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountImp extends UnicastRemoteObject implements RemoteAccount {
    private String accountName;
    private List<RemoteEntry> entries = new ArrayList<>();
    public AccountImp(String accountName) throws RemoteException {
                this.accountName=accountName;
    }
    @Override
    public RemoteEntry findByAmount(double amount) throws RemoteException {
        for(RemoteEntry entry : entries){
            if(entry.getAmount() == amount)
                return entry;
        }
        return null;
    }
    @Override
    public void addEntry(String entryName, double amount, LocalDateTime dateOfTransaction) throws RemoteException {
        if(checkEntry(entryName,dateOfTransaction)) {
            RemoteEntry entry = new EntryImp(entryName, amount, dateOfTransaction);
            this.entries.add(entry);
        }
    }
    @Override
    public List<RemoteEntry> getEntries() throws RemoteException {
        return this.entries;
    }
    @Override
    public String getName() throws RemoteException {
        return this.accountName;
    }
    public boolean checkEntry(String entryName,LocalDateTime dateOfTransaction) throws RemoteException {
            for(RemoteEntry entry : this.entries){
                if(entry.getEntryName().equals(entryName) && dateOfTransaction == entry.getDate()){
                    return false;
                }
            }
            return true;
    }

}
