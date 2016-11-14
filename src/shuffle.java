import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by uil on 11/12/2016.
 */
public class shuffle {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("shuffle.dat"));

        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String []array = in.nextLine().split(" ");
            String[]commands = in.nextLine().split(" ");
            int srs = new Integer(array[1]);
            int index = new Integer(array[2]);
            int songs = new Integer(array[0]);
            for (int i = 0; i < srs; i++) {
                int command = new Integer(commands[i]);
                switch (command)
                {
                    case 0:{
                        index++;
                        if(index>songs - 1) index = 0;
                        break;
                    }
                    case 1:{
                        break;
                    }
                    case 2: {
                        index = (index*33797+1)%songs;
                        break;
                    }
                }
            }
            System.out.println(index);
        }
    }
}
