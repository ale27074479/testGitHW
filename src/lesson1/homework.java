package lesson1;

public class homework {
//задание 1
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //задание 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //задание 3
    public static void checkSumSign() {
        int a = 17;
        int b = 27;
        int sum = (a + b);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // задание 4
    public static void printColor() {
        int value = 777;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //задание 5
    public static void compareNumbers() {
        int a = 7;
        int b = 77;
        if (a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}