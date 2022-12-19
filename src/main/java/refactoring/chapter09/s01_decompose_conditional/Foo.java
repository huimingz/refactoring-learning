package refactoring.chapter09.s01_decompose_conditional;

public class Foo {
    static void getCharge() {
        if (date.bedore(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * _winterRate + _winterServiceCharge;
        } else {
            charge = quantity * _summerRate;
        }
    }
}

public class FooRefactored {
    static void getCharge() {
        if (notSummer(date)) {
            charge = winterCharge();
        } else {
            charge = summerCharge();
        }
    }

    private boolean notSummer(Date date) {
        return date.bedore(SUMMER_START) || date.after(SUMMER_END);
    }

    private double summerCharge(int quantity) {
        return quantity * _summerRate;
    }

    private double winterCharge(int quantity) {
        return quantity * _winterRate + _winterServiceCharge;
    }
}
