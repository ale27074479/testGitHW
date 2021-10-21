package JavaLesson3HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static <R> void swap(R[] array, int firstIndex, int secondIndex) {
        R oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }
    static <R> ArrayList<R> convertToList(R[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}