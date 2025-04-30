package Melgarejo_Repaso.duke_choice;

public class ShopApp {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.setName("Pinky");
        System.out.println(c1.getName());
        /*3*/
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        /*4*/
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize('M');

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize('S');
        /*5*/
        System.out.println("Item 1: " + item1.getDescription() + "," + item1.getPrice() + "," + (char)(item1.getSize()) + "\n" + "Item 2: " + item2.getDescription() + "," + item2.getPrice() + "," + (char)(item2.getSize()));
        /*6*/
        double tax=0.2;
        /*7*/
        double total;
        /*8*/
        total = item1.getPrice() + 2*(item2.getPrice()) + tax;
        System.out.println("Total: " + total);
    }
}