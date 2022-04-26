package menu;

public abstract class Menu {

    protected String name;
    private int price;
    private boolean available;

    public Menu (String name, int price, boolean available){

        this.name = name;
        this.price = price;
        this.available = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    // Behaviours

  //  public abstract void prepareItem();

    public String serveToCustomer(){
        return "Here is your order!";
    }


}
