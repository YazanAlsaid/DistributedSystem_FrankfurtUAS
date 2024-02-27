package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountName;
    private List<Entry> entries = new ArrayList<>();

    public Account(String accountName){
        this.accountName=accountName;
    }
    public Entry findByAmount(double amount){
        for(Entry entry : entries){
            if(entry.getAmount() == amount)
                return entry;
        }
        return null;
    }

    public void addEntry(String entryName, double amount, LocalDate dateOfTransaction) {
            Entry entry = new Entry(entryName, amount, dateOfTransaction);
            this.entries.add(entry);
        }

    public List<Entry> getEntries() {
        return this.entries;
    }
    public String getName() {
        return this.accountName;
    }

}
