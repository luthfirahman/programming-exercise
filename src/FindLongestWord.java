import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindLongestWord {

    public static String findLongestWord(String namaFile) {

        String longestWord = "";
        String word;

        try {
            File file = new File(namaFile);
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                word = input.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        } catch (IOException e) {
            System.out.println("File tidak terbaca");
            e.printStackTrace();
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String namaFile = "/Users/luthfirahman/Desktop/Terjadinya Danau Toba.txt";
        String longestWord = FindLongestWord.findLongestWord(namaFile);
        System.out.println(longestWord);

    }
}
