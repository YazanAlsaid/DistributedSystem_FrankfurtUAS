package model;

import java.time.LocalDate;


public class Entry {

    private String EntryName;
    private LocalDate date;
    private double amount;

    public Entry() {}

    public Entry(String EntryName, double amount, LocalDate date) {
        this.EntryName = EntryName;
        this.amount = amount;
        this.date = date;
    }
    public void setAmount(double amount)  {
        this.amount = amount;
    }
    public String getEntryName()  {
        return this.EntryName;
    }
    public double getAmount()  {
        return this.amount;
    }
    public LocalDate getDate() {
        return this.date;
    }
    public String toString() {
        return "EntryImp{" +
                "EntryName='" + EntryName + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
