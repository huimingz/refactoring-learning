package refactoring.chapter08.s07_change_unidirectional_association_to_bidirectional;

import java.util.HashSet;
import java.util.Set;

public class CustomerAfter {
    private Set<OrderAfter> _orders = new HashSet<>();

    Set<OrderAfter> friendOrders() {
        /* should only be used by Order when modifying the association */
        return _orders;
    }

    void addOrder(OrderAfter order) {
        order.setCustomer(this);
    }
}

class OrderAfter {
    private CustomerAfter _customer;

    CustomerAfter getCustomer() {
        return this._customer;
    }

    void setCustomer(CustomerAfter customer) {
        if (_customer != null) {
            _customer.friendOrders().remove(this);
            _customer = customer;
        }

        if (_customer != null) {
            _customer.friendOrders().add(this);
        }
    }
}
