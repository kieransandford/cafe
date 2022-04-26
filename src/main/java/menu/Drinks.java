package menu;

public class Drinks extends Menu{

    private boolean caffeinated;

    public Drinks(String name, int price, boolean available, boolean caffeinated){
        super(name, price, available);
        this.caffeinated = caffeinated;
    }

    public boolean isCaffeinated() {
        return caffeinated;
    }

}
