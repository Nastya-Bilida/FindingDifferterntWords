import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        HashSet<String> words = new HashSet<String>(100);

        FileReader fileReader = new FileReader("e://MyFile.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), " (){}[]<>#*?!.,:;-'");
            while (stringTokenizer.hasMoreTokens()){
                words.add(stringTokenizer.nextToken());
            }

        }
        System.out.println(" " + words);
         System.out.println("Default words:  " + words.size());

        fileReader.close();

    }
}
