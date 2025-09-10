package duke.choice;

import java.util.ArrayList;
import java.util.Arrays;
//import io.heldion.webserver.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

//TIRA ERROR POR EL MÓDULO DE WEB APP.


public class ShopApp {
    private ArrayList<Clothes> clothes;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShopApp(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public ShopApp() {
        this.clothes= new ArrayList<>();
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void addToCart(Clothes clothe){
        this.clothes.add(clothe);
    }

   // public void webserver(){
   //     try {
   //         ItemList list = new ItemList(items);
   //         Routing routing = Routing.builder()
   //                 .get("/items", list)
   //                 .build();
   //
   //         ServerConfiguration config = ServerConfiguration.builder()
   //                 .bindAddress(InetAddress.getLocalHost())
   //                 .port(8888)
   //                 .build();
   //
   //         WebServer ws = WebServer.create(config, routing);
   //         ws.start();
   //     } catch (UnknownHostException ex) {
   //         ex.printStackTrace();
   //     }
   //
   // }

    public void listClothes(){
        for (Clothes clothe : clothes){
            System.out.println(clothe.toString());
        }
    }

    public void total(double tax){
        double total=0;
        System.out.println(this.customer.getName());
        for (Clothes product: this.clothes){
            if (total > 15){
                break;
            }
            if (product.getSize().equals(this.customer.getSize())){
                product.showDetails();
                total = total + product.getPrice(tax);
            }
        }
        System.out.println("Total: "+total);
    }

    public double promedio(){
        double avg = 0;
        int cont =0;
        for (Clothes c : this.clothes){
            if (c.getSize().equals("L")){
                cont++;
                avg= avg + c.getPrice(Clothes.getTaxRate());
            }
        }
        try {
            return avg/cont; //Por alguna razón, si divide por 0, tira NaN en vez de ArithmetricException
        } catch (ArithmeticException e){
            System.out.println("No hay items de talle  L. " + e.getMessage());
            return 0;
        }

        //  El algoritmo podría evitar la excepción si se chequea con un IF si
        //  la variable cont está en 0. Si lo está, entonces devuelve 0 directamente.
        //  (más un mensaje de que no hay items talle L)
    }



    public static void main(String[] args) {
        System.out.println("Minimum price value = "+Clothes.getMinPrice());
        ShopApp cart = new ShopApp();
        double tax=1.2;
        Clothes.setTaxRate(tax);
        double total;
        int measurement = 3;


        Customer c1 =new Customer("Pinky");
        cart.setCustomer(c1);
        c1.setSize("M");
        Clothes item1 = new Clothes("Blue Jacket", 20.9, "M");
        Clothes item2 = new Clothes("Orange T-shirt", 10.5, "S");
        Clothes item3 = new Clothes("Green Scarf", 5, "S");

        cart.addToCart(item1);

        cart.addToCart(item2);

        cart.addToCart(item3);
        cart.listClothes();

        System.out.println(c1.getName());
        cart.total(tax);

        System.out.println("Promedio de precio por prenda: " + cart.promedio());

        Clothes[] items = {item1, item2, item3};
        Arrays.sort(items);

        System.out.println("Items ordenados por descripcion: ");
        for (Clothes c : items){
            System.out.println(c.toString());
        }


    }
}
