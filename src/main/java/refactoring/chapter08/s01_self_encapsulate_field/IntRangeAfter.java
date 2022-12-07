package refactoring.chapter08.s01_self_encapsulate_field;

public class IntRangeAfter {
    private int _low, _high;

    public IntRangeAfter(int low, int high) {
        initialize(low, high);
    }

    private void initialize(int low, int high) {
        this._low = low;
        this._high = high;
    }

    boolean include(int value) {
        return value >= getLow() && value <= getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    void setHigh(int value) {
        _high = value;
    }

    void setLow(int value) {
        _low = value;
    }

    int getHigh() {
        return _high;
    }

    int getLow() {
        return _low;
    }
}

class CappedRange extends IntRangeAfter {
    private int _cap;
    
    public CappedRange(int low, int high, int cap) {
        super(low, high);
        this._cap = cap;
    }

    public int get_cap() {
        return _cap;
    }
    
    int getHigh() {
        return Math.max(super.getHigh(), get_cap());
    }
}