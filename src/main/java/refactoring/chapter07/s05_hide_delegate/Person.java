package refactoring.chapter07.s05_hide_delegate;

public class Person {
    Department _department;

    public Department getDepartment() {
        return _department;
    }

    public void setDepartment(Department department) {
        _department = department;
    }
}
