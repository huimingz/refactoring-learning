package refactoring.chapter07.s03_extract_class;

public class Person {

    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public String getName() {
        return _name;
    }

    public String GetTelephoneNumber() {
        return "(" + _officeAreaCode + ")" + _officeNumber;
    }

    String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    void setOfficeAreaCode(String code) {
        _officeAreaCode = code;
    }

    String getOfficeNumber() {
        return _officeNumber;
    }

    void setOfficeNumber(String number) {
        _officeNumber = number;
    }
}
