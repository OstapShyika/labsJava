package ua.lviv.iot.lab2;

public class PSU extends ComputerPart{

    private int wattage;

    public PSU(int price, String manufacturer, int wattage){
        super(price, manufacturer);
        this.wattage = wattage;
    }
}
