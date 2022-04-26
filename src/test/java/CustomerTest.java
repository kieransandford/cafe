import customer.Customer;
import menu.Drinks;
import menu.Menu;
import org.junit.jupiter.api.Test;
import table.DrinksOrder;
import table.Table;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerTest {

    private Customer customer;
    private Table menu;
    private Drinks drink;

//    @Test
//    void orderIsEmptyAtBeginning(){
//        assertEquals(1, this.menu.countItems());
//    }

    @Test
    void drinkAdded(){
        customer = new Customer("Kieran", new Table(1));
        drink = new Drinks("Latte", 3, true, false);
        customer.placeOrder();
        assertEquals(1, this.menu.countItems());

    }


}
