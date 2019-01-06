package io.tpd;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class SwitchExpressions {

    public static void main(String[] args) {
        int month = randomMonthNumber();
        int year = LocalDate.now().getYear();
        int numDays = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31 ;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeap(year) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month number");
        };
        System.out.println(String.format("Month %s has %s days this year", month, numDays));
    }

    static int randomMonthNumber() {
        return ThreadLocalRandom.current().nextInt(12) + 1;
    }

    static boolean isLeap(int year) {
        return (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0));
    }

}
