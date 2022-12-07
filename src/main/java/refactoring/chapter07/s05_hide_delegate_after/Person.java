package refactoring.chapter07.s05_hide_delegate_after;

public class Person {
    Department _department;

    public Person getManager() {
        return _department.getManager();
    }
}
