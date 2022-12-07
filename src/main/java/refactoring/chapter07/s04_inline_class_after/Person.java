package refactoring.chapter07.s04_inline_class_after;

public class Person {

    private String _name;
    private String _areaCode;
    private String _number;

    public String getName() {
        return _name;
    }

    public String GetTelephoneNumber() {
        return "(" + _areaCode + ")" + _number;
    }

    String getNumber() {
        return _number;
    }

    void setNumber(String number) {
        _number = number;
    }

    String getAreaCode() {
        return _areaCode;
    }

    void setAreaCode(String code) {
        _areaCode = code;
    }
}
