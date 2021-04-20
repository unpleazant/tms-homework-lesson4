import java.util.Arrays;

import static java.util.Arrays.stream;

/**
 * 2. Шахматная доска.
 * Создать программу для расскаски шахматной доски с помощю цикла.
 * Создать двумерный массив String'ов 8х8.
 * С помощью циклов задать элементам циклам значения B(Black) или W(White).
 * Результат работы программы:
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 */
public class SecondTask extends TaskHelper {

    public static void main(String[] args) {
        String[][] chess = new String[8][8];

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) for (int j = 0; j < 8; j++) chess[i][j] = (j % 2 == 0) ? "W" : "B";
            else for (int j = 0; j < 8; j++) chess[i][j] = (j % 2 == 0) ? "B" : "W";
        }
        stream(chess).forEach(row -> System.out.println(Arrays.deepToString(row)));
    }

}