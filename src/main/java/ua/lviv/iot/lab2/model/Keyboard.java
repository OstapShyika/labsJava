package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;

@Getter
public class Keyboard extends ComputerPart {

    private String material;

    public Keyboard(int price, String manufacturer, int size, String material){
        super("Keyboard", price, manufacturer);
        this.material = material;
    }

    @Override
    public String toString(){
        return super.toString() + "Material: " + this.material + System.lineSeparator();
    }
}
