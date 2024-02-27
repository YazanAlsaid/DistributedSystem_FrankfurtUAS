package Java.DistributedSystem.sheet1;

import Java.DistributedSystem.sheet2.Display;

import java.io.Serializable;

public class Book extends Publication implements Display, Serializable {

    public String author;
    public String ISBN;


    public Book(String title,
                String language,
                float price,
                String author,
                String ISBN) {
        super(title, language, price);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public void print(){
        System.out.println(" { title : "+this.title+
                           " / Language : "+this.language+
                           " / price : "+this.price+
                           " / Author : "+this.author+
                           " / ISBN : "+this.ISBN+
                            " }");

    }
}
