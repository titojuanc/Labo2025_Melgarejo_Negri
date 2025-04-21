package Negri.duke_choice;

public class Clothing {
    private String description;
    private double price;
    private char size;

    public Clothing() {
        this.description = "none";
        this.price = 0;
        this.size = 0;
    }

    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }


}
