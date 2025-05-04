package Melgarejo_Repaso.duke_choice;

public class Clothing {
    private String description;
    private double price;
    private char size;
    private final double MIN_PRICE;
    private final double MIN_TAX;

    public Clothing() {
        this.description = "none";
        this.price = 0;
        this.size = 0;
        this.MIN_PRICE = 10;
        this.MIN_TAX = 0.2;
    }

    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
        this.MIN_PRICE = 10;
        this.MIN_TAX = 0.2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (price + MIN_TAX);
    }

    public void setPrice(double price) {
        if (price > MIN_PRICE){
            this.price = price;
        }else{
            System.out.println("El precio debe ser mayor a "+MIN_PRICE);
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }


}
