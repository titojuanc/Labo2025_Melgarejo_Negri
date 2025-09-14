package Negri.duke_choice;
import io.helidon.webserver.Routing;
import java.net.InetAddress;
import java.net.UnknownHostException;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.util.ArrayList;
import java.util.Arrays;

public class ShopApp{
        public static void main(String[] args) {
            System.out.println("Welcome to duke choice shop");
            double tax = 1.2;
            double total = 0.0;
            double promedio =0.0;
            Clothing item1 = new Clothing("Blue Jacket", 20.9, 'm');
            Clothing item2 = new Clothing("Orange T-shirt", 10.5, 's');
            Clothing item4 = new Clothing("Green scarf", 15.5, 's');
            ArrayList<Clothing>items=new ArrayList<>();
            Customer c1 = new Customer();
            items.add(item1);
            items.add(item2);
            items.add(item4);

            c1.setNombre("pinky");
            c1.setSize('s');
            System.out.println("Hello"+c1.getNombre());
            Arrays.sort(new ArrayList[]{c1.getItems()});
            try {
                Itemlist list = new Itemlist(items);
                Routing routing = Routing.builder()
                    .get("/items",list).build();
                ServerConfiguration config = ServerConfiguration.builder()
                        .bindAddress(InetAddress.getLocalHost())
                        .port(8888).build();
                WebServer ws = WebServer.create(config,routing);
                ws.start();
            } catch (UnknownHostException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }


            for (Clothing i: c1.getItems()){
                System.out.println("Iteam 1 datos:"+" "+i.getDescription()+" "+ i.getPrice()+ " "+i.getSize());
            }

            int mesurement = 3;
            c1.setSize(mesurement);
            switch(mesurement){
                case 1, 2, 3:
                    c1.setSize('s');
                    break;
                case 4, 5, 6:
                    c1.setSize('m');
                    break;
                case 7, 8 ,9:
                    c1.setSize('l');
                    break;
                default:
                    c1.setSize('x');
            }
           
        c1.addItems(items);

            System.out.println("total="+ c1.getTotalClothingCost()+" "+"y el promedio fue:"+c1.getPromedioClothingCost());

        }
    }
