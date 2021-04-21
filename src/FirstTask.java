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
/**
 * Result:
 *
 * /Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE 2.app/Contents/lib/idea_rt.jar=53871:/Applications/IntelliJ IDEA CE 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/evgeny/Documents/tms-homework-lesson4/out/production/tms-homework-lesson4 FirstTask
 * The three-dim array has been initialised
 * [[3, 1, 9], [5, 0, 0], [9, 0, 7]]
 * [[7, 7, 2], [9, 1, 4], [3, 5, 4]]
 * [[7, 8, 7], [8, 7, 8], [7, 8, 6]]
 * Please enter value to increase every element of the three-dim array
 * 10
 * [[13, 11, 19], [15, 10, 10], [19, 10, 17]]
 * [[17, 17, 12], [19, 11, 14], [13, 15, 14]]
 * [[17, 18, 17], [18, 17, 18], [17, 18, 16]]
 *
 * Process finished with exit code 0
 */