import java.util.TreeSet;
import java.io.*;

public class NonduplicateWords {
    public static void main(String[] args) {
        BufferedReader reader;
        try { reader = new BufferedReader(new FileReader(args[0])); }
        catch (FileNotFoundException e) {
            System.out.println("File not found, exiting.");
            return;
        }

        TreeSet<String> words = new TreeSet<>();
        String nextLine;

        try { nextLine = reader.readLine(); }
        catch (IOException e) {
            System.out.println("I/O exception, exiting.");
            return;
        }

        while (nextLine != null) {
            for (String word : nextLine.split("[\\d\\W]+")) {
                if (!word.equals("")) words.add(word);
            }
            try { nextLine = reader.readLine(); }
            catch (IOException e) {
                System.out.println("I/O exception, exiting.");
                return;
            }
        }
        System.out.println(words);
    }
}
