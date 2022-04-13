package ua.lviv.iot.lab2.model;

public abstract class ComputerPart {

    private int price;
    private String manufacturer;
    private String type;

    public ComputerPart(int price, String manufacturer){

        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getPrice( ) {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer( ) {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType( ) {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
