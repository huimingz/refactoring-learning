package refactoring.chapter07.s03_extract_class_after;

public class Person {

    private String _name;
    private TelephoneNumber _telephoneNumber;

    public String getName() {
        return _name;
    }

    public String GetTelephoneNumber() {
        return _telephoneNumber.getTelephoneNumber();
    }

    String getOfficeAreaCode() {
        return _telephoneNumber.getAreaCode();
    }

    void setOfficeAreaCode(String code) {
        _telephoneNumber.setAreaCode(code);
    }

    String getOfficeNumber() {
        return _telephoneNumber.getNumber();
    }

    void setOfficeNumber(String number) {
        _telephoneNumber.setNumber(number);
    }
}
