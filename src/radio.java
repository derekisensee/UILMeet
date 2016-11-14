import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by uil on 11/12/2016.
 */
public class radio {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("radio.dat"));
        int sets = new Integer(in.nextLine());
        while (sets-- > 0) {
            int max = Integer.MIN_VALUE;
            int songs = new Integer(in.nextLine());
            String[] line = in.nextLine().split(" ");
            int[] songList = new int[songs];
            for (int i = 0; i < line.length; i++) {
                songList[i] = new Integer(line[i]);
            }
            for (int i = 0; i < songs; i++) {
                int sum = 0;
                for (int j = i; j < songs; j++) {
                    sum+= songList[j];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println(max >= 0 ? max : 0);
        }
    }
}
