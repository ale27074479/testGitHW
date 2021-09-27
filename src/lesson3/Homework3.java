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
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(array3);
        doubling(array3);
        printArray(array3);
        System.out.println("$$$$$$$@@@@@@");
        int side = 20;
        int[][] array4 = new int[side][side];
        crossFill(array4);
        printArray(array4 );
        int[] returnArrayFromMethod = returnArray(7, 777);
        printArray( returnArrayFromMethod);
        printArray( array3);
        System.out.println(" Min: " + findMin(array3));
        System.out.println(" Max: " + findMax(array3));
        int[] balance = {2, 2, 2, 3, 1, 10};
        System.out.println (checkBalance(balance));

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

    //2 задание
    public static void fillIn(int[] array2) {
        for (int i = 0; i < array2.length; i++)
            array2[i] = i + 1;
    }
    // 3 задание
public static void doubling(int[] array3){
        for(int i=0;i<array3.length;i++)
        if(array3[i]< 6)
        array3[i]*=2;
        }
//4 задание
 public static void crossFill(int[][] array4) {
 for (int i = 0; i < array4.length; i++) {
  array4[i][i] = 1;
  array4[i][array4.length - 1 - i] = 1;
        }
    }
 public static void printArray(int[][] array4) {
    for(i = 0; i < array4.length, i++) {
    printArray(array4[20]);
        }
    }

//5 задание
public static int[] returnArray(int len, int initValue) {
    int[] tempArray = new int[len];

    for (int i = 0; i < tempArray.length; i++) {
        tempArray[i] = initValue;
    }
    return tempArray;
}
//6 задание
private static int findMin(int[] array) {
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }
    return min;
}
    public static int findMax(int[] array3) {
        int max = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > max) {
                max = array3[i];
            }
        }
        return max;
    }

//7 задание
private static boolean checkBalance(int[] array5) {
    int right = 0, left = 0;
    for (int i = 0; i < array5.length - 1; i++) {
        left += array5[i];
        for (int j = i + 1; j < array5.length; j++)
            right += array5[j];
        if (left == right) return true;
        right = 0;
    }
    return false;
}
}



