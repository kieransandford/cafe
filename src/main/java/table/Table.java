package table;

import menu.Cakes;
import menu.Drinks;
import menu.Menu;
import menu.Sandwiches;

import java.util.ArrayList;

public class Table {

    private int tableNumber;
    protected ArrayList<Menu> menu;
    private boolean waitingToOrder;
    private boolean reserved;

    public Table (int tableNumber){
        this.tableNumber = tableNumber;
        this.menu = new ArrayList<>();
        this.waitingToOrder = true;
        this.reserved = false;

    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }

    public boolean isWaitingToOrder() {
        return waitingToOrder;
    }

    public void setWaitingToOrder(boolean waitingToOrder) {
        this.waitingToOrder = waitingToOrder;
    }



    // Behaviours

    public int countItems(){
        return this.menu.size();
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public void addDrink(Drinks drink){
        menu.add(drink);
    }

    public void addCake (Cakes cake){
        menu.add(cake);
    }

    public void addSandwich (Sandwiches sandwich){
        menu.add(sandwich);
    }

}
