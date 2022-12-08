package refactoring.chapter08.s02_replace_data_value_with_object;

import java.util.Collection;
import java.util.Iterator;

public class Order {
    private String _name;

    public Order(String _name) {
        this._name = _name;
    }

    public String get_customer() {
        return this._name;
    }

    public void set_customer(String name) {
        this._name = name;
    }
}

class Usage {
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
