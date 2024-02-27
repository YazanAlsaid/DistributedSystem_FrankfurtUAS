package Java.DistributedSystem.sheet1;

import Java.DistributedSystem.sheet2.Display;

import java.io.Serializable;

public class Publication implements Display, Serializable {

    public String title;
    public String language;
    public float price;

    public Publication(String title,String language,float price){
        this.title = title;
        this.language = language;
        this.price = price;
    }
    public void print(){
        System.out.println(" { title : "+this.title+
                           " / Language : "+this.language+
                           " / price : "+this.price+
                            " }");
    }
}
