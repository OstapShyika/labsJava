package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class Keyboard extends ComputerPart {

    private String material;

    public Keyboard(int price, String manufacturer, int size, String material){
        super(price, manufacturer);
        this.material = material;
    }

    public String getMaterial( ) {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString(){
        return super.toString() + "Material: " + this.material + System.lineSeparator();
    }
}
