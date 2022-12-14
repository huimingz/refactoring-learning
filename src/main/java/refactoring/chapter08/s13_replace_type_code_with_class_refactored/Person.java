package refactoring.chapter08.s13_replace_type_code_with_class_refactored;

public class Person {
    private BloodGroup _bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this._bloodGroup = bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this._bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return this._bloodGroup;
    }
}
