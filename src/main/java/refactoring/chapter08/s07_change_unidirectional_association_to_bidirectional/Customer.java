package refactoring.chapter08.s07_change_unidirectional_association_to_bidirectional;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private Set<Order> _orders = new HashSet<>();

    Set<Order> friendOrders() {
        /* should only be used by Order when modifying the association */
        return _orders;
    }
}

class Order {
    private Customer _customer;

    Customer getCustomer() {
        return this._customer;
    }

    void setCustomer(Customer customer) {
        this._customer = customer;
    }
}
