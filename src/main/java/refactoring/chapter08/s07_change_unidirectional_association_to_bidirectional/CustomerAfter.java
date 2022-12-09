package refactoring.chapter08.s07_change_unidirectional_association_to_bidirectional;

import java.util.HashSet;
import java.util.Set;

public class CustomerAfter {
    private Set<OrderM2M> _orders = new HashSet<>();

    Set<OrderM2M> friendOrders() {
        /* should only be used by Order when modifying the association */
        return _orders;
    }

    void addOrder(OrderM2M order) {
        order.setCustomer(this);
    }
}

class OrderAfter {
    private CustomerM2M _customer;

    CustomerM2M getCustomer() {
        return this._customer;
    }

    void setCustomer(CustomerM2M customer) {
        if (_customer != null) {
            _customer.friendOrders().remove(this);
            _customer = customer;
        }

        if (_customer != null) {
            _customer.friendOrders().add(this);
        }
    }
}
