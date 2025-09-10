package choice;


public class Customer {
    private String name;
    private String size;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void measurement (int measurement){
        switch (measurement){
            case 1, 2, 3 :
                this.setSize("S");
                break;
            case 4, 5, 6 :
                this.setSize("M");
                break;
            case 7, 8, 9 :
                this.setSize("L");
                break;
        }
    }
}
