import java.util.Arrays;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

/**
 * 6. Создайте двумерный массив целых чисел.
 * Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class SixTask extends TaskHelper {

    public static void main(String[] args) {
        int[][] twoDimArr = new int[5][];
        setAll(twoDimArr, oneDimArr -> randomArray(randomizer.nextInt(10), 10));

        System.out.println("Before sort(): ");
        printArray(twoDimArr);

        stream(twoDimArr).forEach(Arrays::sort);

        System.out.println("After sort(): ");
        printArray(twoDimArr);
    }

}