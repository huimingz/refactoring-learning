package refactoring.chapter07.s04_inline_class;

public class Person {

    private String _name;
    private TelephoneNumber _telephoneNumber;

    public String getName() {
        return _name;
    }

    public String GetTelephoneNumber() {
        return _telephoneNumber.getTelephoneNumber();
    }

    TelephoneNumber getOfficeTelephone() {
        return _telephoneNumber;
    }
}
