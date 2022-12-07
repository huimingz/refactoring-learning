package refactoring.chapter07.s05_hide_delegate_after;

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
