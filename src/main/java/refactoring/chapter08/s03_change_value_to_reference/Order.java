package refactoring.chapter08.s03_change_value_to_reference;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;

public class Order {
    private Customer _customer;

    public Order(String name) {
        this._customer = Customer.create(name);
    }

    public String get_customer() {
        return this._customer.get_name();
    }

    public void set_customer(String name) {
        this._customer = Customer.create(name);
    }
}

class Customer {
    private final String _name;
    private static Dictionary<String, Customer> _instances = new Hashtable<>();

    private Customer(String _name) {
        this._name = _name;
    }

    public static Customer create(String name) {
        return _instances.get(name);
    }

    public static Customer getNamed(String name) {
        return _instances.get(name);
    }

    static void load_customers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private void store() {
        _instances.put(this.get_name(), this);
    }

    public String get_name() {
        return _name;
    }

}

class Usage {
    private static int number_of_order_for(Collection orders, String customer) {
        int result = 0;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) {
            refactoring.chapter08.s02_replace_data_value_with_object.Order each = (refactoring.chapter08.s02_replace_data_value_with_object.Order) iterator.next();
            if (each.get_customer().equals(customer)) result++;
        }
        return result;
    }
}
