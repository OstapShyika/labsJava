package ua.lviv.iot.lab2;

public class Keyboard extends ComputerPart{

    private String material;

    public Keyboard(int price, String manufacturer, int size, String material){
        super(price, manufacturer);
        this.material = material;
    }
}
