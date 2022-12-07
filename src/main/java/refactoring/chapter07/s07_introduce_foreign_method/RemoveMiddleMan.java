package refactoring.chapter07.s07_introduce_foreign_method;

import java.util.Date;

public class RemoveMiddleMan {
    class Before {
        void something() {
            Date previousEnd = new Date();
            Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDay() + 1);
        }
    }

    class After {

        void something() {
            Date newStart = nextDay(new Date());
        }

        private static Date nextDay(Date date) {
            return new Date(date.getYear(), date.getMonth(), date.getDay() + 1);
        }
    }
}
