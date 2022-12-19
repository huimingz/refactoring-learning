package refactoring.chapter08.s16_replace_subclass_with_fields_refactored.s16_replace_subclass_with_fields;

class Person {
    private final boolean _isMale;
    private final char _code;

    protected Person(boolean _isMale, char _code) {
        this._isMale = _isMale;
        this._code = _code;
    }

    static Person createMale() {
        return new Person(true, 'M');
    }

    static Person createFemale() {
        return new Person(false, 'F');
    }

    boolean isMale() {
        return _isMale;
    }

    char getCode() {
        return _code;
    }
}
