package refactoring.chapter08.s15_replace_type_code_with_state_or_strategy_refactored;

public class Employee {
    private int _type;
    private EmployeeType employeeType;
    private int _monthlySalary;
    private int _commission;
    private int _bonus;

    Employee(int type) {
        this._type = type;
    }

    int getType() {
        return this._type;
    }

    void setType(int type) {
        employeeType = EmployeeType.newType(type);
    }

    int payAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
