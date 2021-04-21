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
/**
 * Result:
 *
 * /Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE 2.app/Contents/lib/idea_rt.jar=53904:/Applications/IntelliJ IDEA CE 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/evgeny/Documents/tms-homework-lesson4/out/production/tms-homework-lesson4 SixTask
 * Before sort():
 * [5, 8, 0, 7, 3, 3]
 * [3, 2]
 * [2, 5, 0, 9, 3]
 * [6]
 * [3, 1, 9, 2]
 * After sort():
 * [0, 3, 3, 5, 7, 8]
 * [2, 3]
 * [0, 2, 3, 5, 9]
 * [6]
 * [1, 2, 3, 9]
 *
 * Process finished with exit code 0
 */