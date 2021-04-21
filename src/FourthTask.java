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
/**
 * Result:
 *
 * /Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE 2.app/Contents/lib/idea_rt.jar=53887:/Applications/IntelliJ IDEA CE 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/evgeny/Documents/tms-homework-lesson4/out/production/tms-homework-lesson4 FourthTask
 * [4, 6, 1, 9, 9]
 * [9, 9, 0, 3, 1]
 * [9, 2, 0]
 * Sum = 62
 *
 * Process finished with exit code 0
 */