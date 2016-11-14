import java.io.*;
import java.util.Scanner;

/**
 * Created by uil on 11/12/2016.
 */
public class rpm {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("rpm.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            Double convert = Double.parseDouble(in.nextLine());
            System.out.printf("%.2f\n", 1./convert);
        }
    }
}
