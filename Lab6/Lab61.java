import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Lab61 {
    public static void main(String[] args) {
        BufferedReader file;
        try {
            file = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            System.out.println("NO SUCH FILE. EXITING");
            return;
        }

        ArrayList<String> allWords = new ArrayList<String>();
        String nextLine;
        try {
            nextLine = file.readLine();
        } catch (IOException e) {
            System.out.println("I/O Error, exiting...");
            return;
        }

        while (nextLine != null) {
            String[] words = nextLine.split(" ");
            for (String word : words) {
                if (word.length() == 0) continue;
                if (Character.isLetter(word.charAt(0))) allWords.add(word);
            }

            try {
                nextLine = file.readLine();
            } catch (IOException e) {
                System.out.println("I/O Error, exiting...");
                return;
            }

        }
        Collections.sort(allWords);
        System.out.println(allWords);
    }
}

