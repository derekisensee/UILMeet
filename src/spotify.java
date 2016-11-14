import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by uil on 11/12/2016.
 */
public class spotify {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("spotify.dat"));

        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String []array = in.nextLine().split(" ");
            ArrayList<Integer>songs = new ArrayList<>();
            String[]happy = in.nextLine().split(" ");
            for (int i = 0; i < new Integer(array[0]); i++) {
                songs.add(new Integer(happy[i]));
            }
            int skips = new Integer(array[1]);
            while(skips-->0)
            {
                int currentMin = 0;
                for (int i = 1; i < songs.size(); i++) {
                    if(songs.get(i)<songs.get(currentMin))
                    {
                        currentMin=i;
                    }
                }
                if(songs.get(currentMin)<0) songs.remove(currentMin);
            }
            int sum = 0;
            for(int i : songs)
            {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}
