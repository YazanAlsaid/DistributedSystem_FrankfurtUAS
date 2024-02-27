package Java.DistributedSystem.sheet2;

import java.io.Serializable;

public class Car implements Display, Serializable {

    private String colour;
    private int horsepower;
    private double weight;

    public Car(String colour, int horsepower, double weight) {
        this.colour = colour;
        this.horsepower = horsepower;
        this.weight = weight;
    }
    @Override
    public void print(){
        System.out.println(" { colour : "+this.colour+
                " / horsepower :  "+this.horsepower+"" +
                " / weight : "+this.weight+
                " } ");
    }
}
