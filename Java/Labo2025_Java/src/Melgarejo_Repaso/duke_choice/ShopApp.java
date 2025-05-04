package Melgarejo_Repaso.duke_choice;

public class ShopApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("Pinky", 3);

        System.out.println(c1.getName());
        /*3*/
        Clothing item1 = new Clothing("Blue Jacket", 20.9, 'M');
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, 'S');
        Clothing item3 = new Clothing("Green Scarf", 5, 'S');
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, 'S');

        /*5*/
        System.out.println("Item 1: " + item1.getDescription() + "," + item1.getPrice() + "," + (char)(item1.getSize()) + "\n" + "Item 2: " + item2.getDescription() + "," + item2.getPrice() + "," + (char)(item2.getSize()));
        /*6*/
        double tax=0.2;
        /*7*/
        double total=0.0;
        /*8*/
        //total = item1.getPrice() + 2*(item2.getPrice()) + tax;
        //System.out.println("Total: " + total);

        /*4.1*/
        c1.setSize("S");

        /*4.2*/
        Clothing[] items = {item1, item2, item3, item4};

        c1.addItems(items);

        c1.getTotalClothingCost();

        for (Clothing item : items) {
            System.out.println("Item: " + item.getDescription() + "," + item.getPrice() + "," + (char)(item.getSize()));
        }



    }
}