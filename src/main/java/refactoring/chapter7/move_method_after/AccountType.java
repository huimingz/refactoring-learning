package refactoring.chapter7.move_method_after;

class AccountType {
    public boolean isPremium() {
        return true;
    }
    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
            return result;
        }
        return daysOverdrawn * 1.75;
    }
}
