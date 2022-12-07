package refactoring.chapter07.s06_remove_middle_man;

public class Department {
    private String _chargeCode;
    private Person _manager;

    public Department(Person person) {
        this._manager = person;
    }

    public Person getManager() {
        return this._manager;
    }
}
