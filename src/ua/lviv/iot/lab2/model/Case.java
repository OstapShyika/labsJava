package ua.lviv.iot.lab2.model;

public class Case extends ComputerPart {

    private int weight;

    public Case(int price, String manufacturer, int weight){
        super(price, manufacturer);
        this.weight = weight;
    }
}
