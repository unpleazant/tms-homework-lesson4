import java.util.Arrays;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

/**
 * 4. Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму всех элементов массива.
 */
public class FourthTask extends TaskHelper {

    public static void main(String[] args) {
        int[][] twoDimArr = new int[3][];
        setAll(twoDimArr, oneDimArr -> randomArray(randomizer.nextInt(10), 10));
        printArray(twoDimArr);

        System.out.println("Sum = " + stream(twoDimArr).mapToInt(arr -> stream(arr).sum()).sum());
    }

}