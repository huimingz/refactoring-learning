package refactoring.chapter08.s14_replace_type_code_with_subclasses;

public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int type) {
        this._type = type;
    }
}
