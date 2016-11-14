import java.io.*;
import java.util.*;

/**
 * Created by uil on 11/12/2016.
 */
public class range {
    static int currentMin = Integer.MAX_VALUE;
    static void recur(int x, int y, char[][] array, int count) {
        if (array[x][y] == 'M') {
            currentMin = count;
            System.out.println("MOM");
        } else if (array[x][y] == '.' && count < currentMin || array[x][y] == 'S' && count < currentMin) {

                array[x][y] = 'V';
                if (x + 1 < array.length && x - 1 >= 0 ) {
                    recur(x - 1, y, array, count + 1);
                    recur(x + 1, y, array, count + 1);
                }
                if (y + 1 < array.length && y - 1 >= 0) {
                    recur(x, y - 1, array, count + 1);
                    recur(x, y + 1, array, count + 1);
                }
                array[x][y] = '.';
        }
        else
            currentMin = 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("range.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            int size = Integer.parseInt(in.nextLine());
            char[][] map = new char[size][size];
            for (int i = 0; i < size; i++) { // map creation
                char[] line = in.nextLine().toCharArray();
                for (int j = 0; j < size; j++) {
                    map[i][j] = line[j];
                }
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (map[i][j] == 'S')
                        recur(i, j, map, 0);
                }
            }
            System.out.println(currentMin);
        }
    }
}
