import java.util.Arrays;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

/**
 * 5. Создайте двумерный массив.
 * Выведите на консоль диагонали массива.
 */
public class FifthTask extends TaskHelper {

    public static void main(String[] args) {
        int[][] twoDimArr = new int[5][];
        setAll(twoDimArr, oneDimArr -> randomArray(5, 10));
        printArray(twoDimArr);
        System.out.println();

        int i, j;
        int l = twoDimArr.length;
        System.out.println("from top left to bottom right");
        for (i = 0, j = 0; i < l; i++, j++) System.out.print(twoDimArr[i][j] + " ");
        System.out.println();

        System.out.println("from bottom left to top right");
        for (i = l-1, j = 0; j < l; i--, j++) System.out.print(twoDimArr[i][j] + " ");
        System.out.println();

        System.out.println("from top right to bottom left");
        for (i = 0, j = l-1; i < l; i++, j--) System.out.print(twoDimArr[i][j] + " ");
        System.out.println();

        System.out.println("from bottom right to top left");
        for ( i = l-1, j = l-1; j >= 0; i--, j--) System.out.print(twoDimArr[i][j] + " ");
    }

}