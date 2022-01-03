import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];
        int temp = 0;

        array[19] = 60;
        array[20] = 61;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
