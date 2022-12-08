package refactoring.chapter08.s02_replace_data_value_with_object;

import java.util.Collection;
import java.util.Iterator;

public class OrderAfter {
    private Customer _customer;

    public OrderAfter(String name) {
        this._customer = new Customer(name);
    }

    public String get_customer() {
        return this._customer.get_name();
    }

    public void set_customer(String name) {
        this._customer = new Customer(name);
    }
}

class Customer {
    private final String _name;

    public Customer(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }
}

class UsageAfter {
    private static int number_of_order_for(Collection orders, String customer) {
        int result = 0;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order each = (Order) iterator.next();
            if (each.get_customer().equals(customer)) result++;
        }
        return result;
    }
}
