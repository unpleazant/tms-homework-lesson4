import static java.util.Arrays.setAll;

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
/**
 * Result:
 *
 * /Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE 2.app/Contents/lib/idea_rt.jar=53890:/Applications/IntelliJ IDEA CE 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/evgeny/Documents/tms-homework-lesson4/out/production/tms-homework-lesson4 FifthTask
 * [6, 5, 8, 5, 4]
 * [0, 7, 9, 3, 9]
 * [2, 4, 7, 2, 0]
 * [9, 1, 2, 8, 1]
 * [4, 3, 1, 2, 8]
 *
 * from top left to bottom right
 * 6 7 7 8 8
 * from bottom left to top right
 * 4 1 7 3 4
 * from top right to bottom left
 * 4 3 7 1 4
 * from bottom right to top left
 * 8 8 7 7 6
 * Process finished with exit code 0
 */