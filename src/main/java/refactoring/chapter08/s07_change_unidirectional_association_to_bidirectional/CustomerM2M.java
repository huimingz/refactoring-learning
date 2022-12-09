package refactoring.chapter08.s07_change_unidirectional_association_to_bidirectional;

import java.util.HashSet;
import java.util.Set;

public class CustomerM2M {
    private Set<OrderM2M> _orders = new HashSet<>();

    Set<OrderM2M> friendOrders() {
        /* should only be used by Order when modifying the association */
        return _orders;
    }

    void addOrder(OrderM2M order) {
        order.addCustomer(this);
    }

    void removeOrder(OrderM2M order) {
        order.removeCustomer(this);
    }
}

class OrderM2M {
    private Set<CustomerM2M> _customers = new HashSet<>();

    Set<CustomerM2M> getCustomers() {
        return this._customers;
    }

    void addCustomer(CustomerM2M customer) {
        customer.friendOrders().add(this);
        this._customers.add(customer);
    }

    void removeCustomer(CustomerM2M customer) {
        customer.friendOrders().remove(this);
        this._customers.remove(customer);
    }

}
