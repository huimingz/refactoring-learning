package refactoring.chapter08.s13_replace_type_code_with_class_refactored;

public class BloodGroup {
    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);
    private static final BloodGroup[] _values = {O, A, B, AB};

    private final int _code;

    public BloodGroup(int code) {
        this._code = code;
    }

    public int getCode() {
        return this._code;
    }

    public static BloodGroup code(int code) {
        return _values[code];
    }
}
