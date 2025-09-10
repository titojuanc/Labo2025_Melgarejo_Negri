package duke.choice;

public class Clothes implements Comparable<Clothes> {
    private String description;
    private String size;
    private double price;
    private static double minPrice=0.0;
    private static double taxRate=0.0;

    public Clothes(String description, double price, String size){
        this.description=description;
        this.price=price;
        this.size=size;
    }
    public Clothes(){
        this.description="Default";
        this.price=912.18;
        this.size="M";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice(double tax) { return price*tax; }

    public static double getMinPrice() {return minPrice;}

    public static void setMinPrice(double precioMin) { minPrice = precioMin; }

    public static double getTaxRate() { return taxRate; }

    public static void setTaxRate(double tax) { taxRate = tax; }

    @Override
    public String toString() {
       return (this.description+", "+this.size+", "+this.price);
    }

    public void setPrice(double price) {
        if (price<10){
            this.price=10;
        }
        else {
            this.price = price;
        }

    }



    public void showDetails() {
        System.out.println(this.description+", "+this.size+", "+this.price);
    }

    @Override
    public int compareTo(Clothes o) {
        return this.description.compareTo(o.getDescription());
    }
}
