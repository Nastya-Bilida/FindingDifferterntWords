import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static final String SEPARATION_SYMBOLS = " (){}[]<>#*?!.,:;-'";

    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        String line = "";
        try {
            FileReader fileReader = new FileReader("./src/myTextFile.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(line.toLowerCase(), SEPARATION_SYMBOLS);
                while (stringTokenizer.hasMoreTokens()) {
                    words.add(stringTokenizer.nextToken());
                }
            }
        } catch (IOException error) {
            System.err.println(error);
        }
        System.out.println("Count of unique words:  " + words.size());
        System.out.println(words);
    }
}