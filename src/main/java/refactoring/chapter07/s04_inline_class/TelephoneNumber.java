package refactoring.chapter07.s04_inline_class;

public class TelephoneNumber {
    private String _areaCode;
    private String _number;

    public String getTelephoneNumber() {
        return "(" + _areaCode + ")" + _number;
    }

    String getAreaCode() {
        return _areaCode;
    }

    void setAreaCode(String code) {
        _areaCode = code;
    }

    String getNumber() {
        return _number;
    }

    void setNumber(String number) {
        _number = number;
    }
}
