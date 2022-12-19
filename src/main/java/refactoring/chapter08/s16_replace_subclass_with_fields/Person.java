package refactoring.chapter08.s16_replace_subclass_with_fields;

abstract class Person {
    abstract boolean isMale();

    abstract char getCode();
}

class Male extends Person {
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}

class Female extends Person {
    @Override
    boolean isMale() {
        return false;
    }

    @Override
    char getCode() {
        return 'F';
    }
}