import java.io.*;
import java.util.*;
/**
 * Created by uil on 11/12/2016.
 */
public class sort {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("sort.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int records = Integer.parseInt(in.nextLine());
            for (int i = 0; i < records; i++) { // original list
                list.add(in.nextInt());
            }
            ArrayList<Integer> copy = new ArrayList<>();
            for (int i = 0; i < records; i++) { // creates copy of list
                copy.add(list.get(i));
            }
            if (list.get(0) != 1) {
                list.indexOf(1);

            }
            Collections.sort(copy);
            int count = 0;
            for (int i = 0; i < records; i++) { // determine the different spots in list, works if list starts with 1
                if (list.get(i) != copy.get(i)) {
                    count++;
                }
            }
            System.out.println(count);
            in.nextLine();
        }
    }
}
