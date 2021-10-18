package lesson2;
public class HW2 {
    public static void main(String[] args) {
        boolean within10and20;
        System.out.println("Проверка > " + within10and20(7, 10));
        System.out.println("@@@@@@@@@@@@@@@@@@@черта");
        int x = 7;
        isPositiveOrNegative(-7);
        System.out.println("@@@@@@@@@@@@@@@@@@@черта");

        boolean isNegative;
        printWordNTimes("Football", 7);
        System.out.println("@@@@@@@@@@@@@@@@@@@черта");
        System.out.println("@@@@@@@@@@@@@@@@@@@черта");
        boolean LeapYear;
        int Year = 1994;

        System.out.println("Year " + Year + " Leap? > " + LeapYear(Year));
        System.out.print("@@@@@@@@@@@@@@@@@@@черта");
    }

    // 1 задание
    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return 10 <= sum && sum <= 20;
    }

    // 2 задание
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    // 3 задание
    public static boolean isNegative(int x) {
        return x < 0;
    }
    // 4 задание
    public static void printWordNTimes(String value, int count) {
        for (int i = 1; i <= 7; i++) {
            System.out.print("Football " + i + " ");
        }
    }
    // 5 задание
    public static boolean LeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}