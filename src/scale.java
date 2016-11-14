import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by uil on 11/12/2016.
 */
public class scale {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("scale.dat"));
        int sets = new Integer(in.nextLine());
        String[] sharps = new String[] {
                "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"
        };
        String[] flats = new String[]{
                "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab"
        };

        String[] fullList = new String[]{
                "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#",
                "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab"
        };

        while (sets-- > 0) {
            String note = in.nextLine();
            int index = 0;
            if (isSharp(note) || note.equalsIgnoreCase("C")) {
                for (int i = 0; i < sharps.length; i++) {
                    if (sharps[i].equalsIgnoreCase(note)) {
                        index = i;
                    }
                }
            }
            if (note.equalsIgnoreCase("C")) {
                for (int i = index; i < fullList.length; i++) {
                    if (i > fullList.length - 1) {
                        i = i - fullList.length - 2;
                    }
                    System.out.print(fullList[i]);
                }
                System.out.println();
            }
            if (isSharp(note)) {
                for (int i = index; i < sharps.length; i++) {
                    if (i > sharps.length - 1) {
                        i = i - sharps.length - 2;
                    }
                    System.out.print(sharps[i]);
                }
                System.out.println();
            } else {
                for (int i = 0; i < flats.length; i++) {
                    if (i > flats.length - 1) {
                        i = i - flats.length - 2;
                    }
                    System.out.print(flats[i]);
                }
                System.out.println();
            }
        }
    }

    public static boolean isSharp(String c) {
        if (c.equalsIgnoreCase("G") ||
                c.equalsIgnoreCase("D") ||
                c.equalsIgnoreCase("A") ||
                c.equalsIgnoreCase("E") ||
                c.equalsIgnoreCase("B") ||
                c.equalsIgnoreCase("F#")) {
            return true;
        }
        return false;
    }
}
