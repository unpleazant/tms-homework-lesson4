import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

public class TaskHelper {

    static Scanner input = new Scanner(System.in);
    static Random randomizer = new Random();

    static int[] randomArray(int arrayLength, int elementsValuesBounds) {
        int[] array = new int[arrayLength];
        setAll(array, i -> new Random().nextInt(elementsValuesBounds));
        return array;
    }

    static void printArray(int[][][] arr) {
        stream(arr).forEach(twoDimArr -> System.out.println(Arrays.deepToString(twoDimArr)));
    }

    static void printArray(int[][] arr) {
        stream(arr).forEach(oneDimArr -> System.out.println(Arrays.toString(oneDimArr)));
    }



}