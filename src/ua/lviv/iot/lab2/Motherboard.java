package ua.lviv.iot.lab2;

public class Motherboard extends ComputerPart{

    private int max_ram;

    public Motherboard(int price, String manufacturer, int max_ram) {
        super(price, manufacturer);
        this.max_ram = max_ram;
    }
}
