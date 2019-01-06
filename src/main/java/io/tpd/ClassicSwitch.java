package io.tpd;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class ClassicSwitch {

    public static void main(String[] args) {
        int month = randomMonthNumber();
        int year = LocalDate.now().getYear();
        int numDays;
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                numDays = isLeap(year) ? 29 : 28;
            break;
            default:
                throw new IllegalArgumentException("Invalid month number");
        }
        System.out.println(String.format("Month %s has %s days this year", month, numDays));
    }

    static int randomMonthNumber() {
        return ThreadLocalRandom.current().nextInt(12) + 1;
    }

    static boolean isLeap(int year) {
        return (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0));
    }

}
