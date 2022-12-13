package refactoring.chapter08.s10_encapsulate_field;

public class Foo {
    public String _name;
}

class FooRefactored {
    private String _name;

    public String getName() {
        return _name;
    }

    public void SetName(String name) {
        this._name = name;
    }
}