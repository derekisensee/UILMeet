import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by uil on 11/12/2016.
 */
public class bluetooth {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(new File("bluetooth.dat"));

        int sets = new Integer(in.nextLine());

        while(sets-->0)
        {
            String hex = in.nextLine();
            for (int i = 0; i < hex.length(); i+=2) {
                String hexVal = hex.substring(i,i+2);
                //int num = Integer.parseInt(hexVal, 16);
                //String num = Integer.toString(new Integer(hexVal), 10);
                int num = Integer.parseInt(hexVal,16);

                System.out.print((char)num);
            }
            System.out.println();
        }
    }
}
