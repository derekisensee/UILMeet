import java.io.*;
import java.util.*;

/**
 * Created by uil on 11/12/2016.
 */
public class volume {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("volume.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            int passengers = new Integer(in.nextLine());
            int[] prefVols = new int[passengers];
            String[] line = in.nextLine().split(" ");
            for (int i = 0; i < passengers; i++) {
                prefVols[i] = new Integer(line[i]);
            }
            int leastDiscomfort = Integer.MAX_VALUE;
            int finV = 0;
            for (int i = 0; i < passengers; i++) {
                int currentVolume = prefVols[i];
                int dSum = 0;
                for (int j = 0; j < passengers; j++) {
                    dSum += Math.abs(currentVolume - prefVols[j]);
                }
                if (dSum < leastDiscomfort) {
                    leastDiscomfort = dSum;
                    finV = currentVolume;
                }
            }
            System.out.println(finV);
        }
    }
}
