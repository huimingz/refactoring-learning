package refactoring.chapter08.s15_replace_type_code_with_state_or_strategy;

public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int _monthlySalary;
    private int _commission;
    private int _bonus;

    Employee(int type) {
        this._type = type;
    }

    int getType() {
        return this._type;
    }

    void setType(int type){
        this._type = type;
    }

    int payAmount() {
        switch (getType()) {
            case ENGINEER:
                return _monthlySalary;
            case SALESMAN:
                return _monthlySalary + _commission;
            case MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
