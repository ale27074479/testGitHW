package lesson3;
public class homework3 {
public static void main(String[] args) {
    int[] array1 = { 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1 };
    System.out.println("Before: " + Arrays.toString(array1));
    change(array1);
    System.out.println("After: " + Arrays.toString(array1));
}
//1 задание
public static void printArray1( int[] inputArray) {
   System.out.print(int);
    for (int i = 0; i < inputArray.length; i++) {
   System.out.print(inputArray[i] + " ");
    }
}
public static void change(int[] array) {
    for (int i = 0; i < array.length; i++)
        if (array[i] == 1) {
            array[i] = 0;
        } else {
            array[i] = 1;
        }
}



//2 задание
//public static void fillIn(int[] array) {
      //for (int i = 0; i < array.length; i++)
  //    array[i] = i + 1;
 //   }
   // }