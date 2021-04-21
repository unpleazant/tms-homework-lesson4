/**
 * 3. Умножение двух матриц.
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * втрой массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат:  1  2  3   1  1  1   0  0  0
 */
public class ThirdTask extends TaskHelper {

    public static void main(String[] args) {
        int[][] matrixA = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] matrixB = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int m = matrixA.length;
        int n = matrixB[0].length;
        int o = matrixB.length;
        int[][] matrixC = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        printArray(matrixC);
    }

}
/**
 * Result:
 *
 * /Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE 2.app/Contents/lib/idea_rt.jar=53788:/Applications/IntelliJ IDEA CE 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/evgeny/Documents/tms-homework-lesson4/out/production/tms-homework-lesson4 ThirdTask
 * [1, 2, 3]
 * [1, 1, 1]
 * [0, 0, 0]
 *
 * Process finished with exit code 0
 */