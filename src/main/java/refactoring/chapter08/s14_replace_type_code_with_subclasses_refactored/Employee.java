package refactoring.chapter08.s14_replace_type_code_with_subclasses_refactored;

public abstract class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("incorrect type code value");
        }
    }

    abstract int getType();
}

class Engineer extends Employee {

    public int getType() {
        return Employee.ENGINEER;
    }
}

class Salesman extends Employee {

    @Override
    int getType() {
        return Employee.SALESMAN;
    }
}

class Manager extends Employee {

    @Override
    int getType() {
        return Employee.MANAGER;
    }
}