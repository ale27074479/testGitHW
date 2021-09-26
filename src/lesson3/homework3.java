package lesson3;
public class homework3 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1};
        printArray(array1);
        change(array1);

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
//public static void fillIn(int[] array) {
      //for (int i = 0; i < array.length; i++)
  //    array[i] = i + 1;
 //   }
   // }