package Client;


import java.io.Serializable;

public class Message implements Serializable {
    private String accountName;
    private String selectedMethod;
    private Object[] data;

    public Message(String accountName,String selectedMethod,Object[] data) {
        this.accountName = accountName;
        this.selectedMethod = selectedMethod;
        this.data = data;

    }
    public Message(Object[] data){
        this.data = data;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getSelectedMethod() {
        return selectedMethod;
    }

    public Object[] getData() {
        return data;
    }
}

