package refactoring.chapter07.s06_remove_middle_man;

public class Person {
    Department _department;

    public Person getManager() {
        return _department.getManager();
    }
}
