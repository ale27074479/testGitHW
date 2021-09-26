package lesson3;
public class Homework3 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1};
        printArray(array1);
        change(array1);
        System.out.println("$$$$$$$@@@@@@");
        printArray(array1);
        int[] array2 = new int[100];
        fillIn(array2);
        printArray(array2);
        System.out.println("$$$$$$$@@@@@@");

    }
    //1 задание
    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
    }
}

//2 задание
public static void fillIn(int[] array2) {
    for (int i = 0; i < array2.length; i++)
        array2[i] = i + 1;
}
}
