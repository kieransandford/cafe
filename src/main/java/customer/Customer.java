package customer;

import menu.Cakes;
import menu.Drinks;
import menu.Sandwiches;
import table.Table;

public class Customer {

    private String name;
    private Table table;

    public Customer (String name, Table table){
        this.name = name;
        this.table = table;
    }


    public void placeOrder(Drinks drink){
        this.table.addDrink(drink);
    }

    public void placeOrder(Cakes cake){
        this.table.addCake(cake);
    }

    public void placeOrder(Sandwiches sandwich){
        this.table.addSandwich(sandwich);
    }

}
