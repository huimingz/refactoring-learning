package refactoring.chapter07.s08_introduce_local_extension;

import java.util.Date;

public class MfDateSub extends Date {
    public MfDateSub(Date date) {
        super(date.getTime());
    }

    Date nextDay() {
        return new Date(getYear(), getMonth(), getDay() + 1);
    }
}