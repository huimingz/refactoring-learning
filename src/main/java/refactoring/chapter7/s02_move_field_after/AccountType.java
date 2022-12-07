package refactoring.chapter7.s02_move_field_after;

class AccountType {
    private double _interestRate;

    void setInterestRate(double rate) {
        this._interestRate = rate;
    }

    double getInterestRate() {
        return this._interestRate;
    }
}
