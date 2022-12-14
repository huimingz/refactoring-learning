package refactoring.chapter08.s13_replace_type_code_with_class;

public class Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;

    private int _bloodGroup;

    public Person(int bloodGroup) {
        this._bloodGroup = bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this._bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return this._bloodGroup;
    }
}
