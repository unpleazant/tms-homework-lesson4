import java.util.Arrays;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

/**
 * 1. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 * Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */

public class FirstTask extends TaskHelper {

    public static void main(String[] args) {
        int[][][] threeDimArr = new int[3][3][3];
        stream(threeDimArr).forEach(twoDimArr -> setAll(twoDimArr, oneDimArr -> randomArray(3, 10)));
        System.out.println("The three-dim array has been initialised");
        printArray(threeDimArr);

        System.out.println("Please enter value to increase every element of the three-dim array");
        int increaseVal = input.nextInt();
        stream(threeDimArr).forEach(twoDimArr -> stream(twoDimArr).forEach(oneDimArr -> increase(oneDimArr, increaseVal)));
        printArray(threeDimArr);
    }

    static int[] increase(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) arr[i] += value;
        return arr;
    }

}