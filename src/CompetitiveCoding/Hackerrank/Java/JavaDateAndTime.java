package CompetitiveCoding.Hackerrank.Java;

import java.util.*;

public class JavaDateAndTime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        String day = scanner.next();
        String year = scanner.next();

        System.out.println(getDay(day, month, year));
    }

    private static String getDay(String day, String month, String year) {
        int lastDigitsOfYear = Integer.parseInt(year.substring(2,4));
        int yearCode = lastDigitsOfYear/4;
        int days = Integer.parseInt(day);
        int monthCode = getMonthCode(Integer.parseInt(month), Integer.parseInt(year));
        int centuryCode = getCenturyCode(Integer.parseInt(year.substring(0,2)));
        int diviend = yearCode + days + monthCode + centuryCode + lastDigitsOfYear;
        int remainder = diviend % 7;
        return getDayOfTheWeek(remainder);
    }

    private static int getMonthCode(int month, int year) {
        switch(month) {
            case 1:
                if(isALeapYear(year)) {
                    return 0;
                } else {
                    return 1;
                }
            case 2:
                if(isALeapYear(year)) {
                    return 3;
                } else {
                    return 4;
                }
            case 3:
                return 4;
            case 4:
                return 0;
            case 5:
                return 2;
            case 6:
                return 5;
            case 7:
                return 0;
            case 8:
                return 3;
            case 9:
                return 6;
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 6;
            default:
                return 0;
        }
    }

    private static int getCenturyCode(int year) {
        int remainder = year % 4;
        switch(remainder) {
            case 0:
                return 6;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                return 0;
        }
    }

    private static boolean isALeapYear(int year) {
        return (year%400 == 0) || (year%4 == 0 && !(year%100 == 0));
    }

    private static String getDayOfTheWeek(int remainder) {
        switch(remainder) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            default:
                return "Something is not right.";
        }
    }
}
