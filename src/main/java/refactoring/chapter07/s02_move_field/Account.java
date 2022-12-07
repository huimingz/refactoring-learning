package refactoring.chapter07.s02_move_field;

public class Account {

    private AccountType _type;
    private double _interestRate;

    double interestForAccount_days(double amount, int days) {
        return _interestRate * amount / 365;
    }
}

