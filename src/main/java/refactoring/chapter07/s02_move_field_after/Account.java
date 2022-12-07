package refactoring.chapter07.s02_move_field_after;

public class Account {

    private AccountType _type;
    private double _interestRate;

    double interestForAccount_days(double amount, int days) {
        return this._type.getInterestRate() * amount / 365;
    }

}

