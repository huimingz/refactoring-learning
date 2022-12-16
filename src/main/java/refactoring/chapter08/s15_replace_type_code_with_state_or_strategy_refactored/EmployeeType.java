package refactoring.chapter08.s15_replace_type_code_with_state_or_strategy_refactored;


public abstract class EmployeeType {
    abstract int getTypeCode();

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }
}

class Engineer extends EmployeeType {

    @Override
    int getTypeCode() {
        return ENGINEER;
    }
}

class Manager extends EmployeeType {

    @Override
    int getTypeCode() {
        return MANAGER;
    }
}

class Salesman extends EmployeeType {

    @Override
    int getTypeCode() {
        return SALESMAN;
    }
}
