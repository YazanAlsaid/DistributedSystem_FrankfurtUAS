import java.rmi.Naming;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.List;

public class Client {
    public static double total_Amount(RemoteAccount account1) throws RemoteException{
        double total = 0.0d;
        List<RemoteEntry> entries = account1.getEntries();
        for(int i = 0;i < entries.size();i++) {
            total += entries.get(i).getAmount();
        }
            return total;
    }  
    public static void main(String[] args)  {
        try {
            // Account-1- ---->

            System.out.println("Die erste Konto : ");

            RemoteAccount account1 = (RemoteAccount) Naming.lookup("rmi://localhost/yazan");

            System.out.println(account1.getName());
            account1.addEntry("aldi", 13.44d, LocalDateTime.now());
            account1.addEntry("Mohammad", 400.99d,LocalDateTime.of(2023, 06, 5, 20, 26, 49));
            System.out.println("All entries of Account1 : ");

            List<RemoteEntry> entriesOfAccount1 = account1.getEntries();
            for(RemoteEntry entry : entriesOfAccount1){
                System.out.println(entry.getEntryName()+" / "+
                                  entry.getAmount()+" / "+
                                    entry.getDate());
            }
            System.out.println("total Amount : "+Client.total_Amount(account1));


            // Accaount-2- ------>

            System.out.println("Die zweite Konto : ");

              RemoteAccount account2 = (RemoteAccount) Naming.lookup("rmi://localhost/Mohammad");

              System.out.println(account2.getName());
              account2.addEntry("yazan",400.99d,LocalDateTime.of(2023, 06, 5, 20, 26, 49));
              System.out.println("die suchende betrag :  "+account2.findByAmount(400.99d).getEntryName()+" / "+account1.findByAmount(400.99d).getDate());
              System.out.println("total Amount : "+Client.total_Amount(account2));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
