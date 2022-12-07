package refactoring.chapter07.s08_introduce_local_extension;

import java.util.Date;

public class MfDateWrap {
    private Date _original;

    public MfDateWrap(Date date) {
        this._original = date;
    }

    Date nextDay() {
        return new Date(_original.getYear(), _original.getMonth(), _original.getDay() + 1);
    }
}
