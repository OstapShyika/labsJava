package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class Monitor extends ComputerPart {

    private int size;
    private String resolution;

    public Monitor(int price, String manufacturer, int size, String resolution){
        super(price, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public int getSize( ) {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String getResolution( ) {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString(){
        return super.toString() + "Size: " +
                this.size+ "cm, " + "Resolution: " +
                this.resolution + System.lineSeparator();
    }
}
