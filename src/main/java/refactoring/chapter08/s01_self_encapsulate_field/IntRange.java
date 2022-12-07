package refactoring.chapter08.s01_self_encapsulate_field;

public class IntRange {
    private int _low, _high;

    public IntRange(int low, int high) {
        this._low = low;
        this._high = high;
    }

    boolean include(int value) {
        return value >= _low && value <= _high;
    }

    void grow(int factor) {
        _high *= factor;
    }
}
