import java.util.Scanner;

public class CountWord {

    public static int countWord(String input) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ketikkan kalimat anda: ");
        input = keyboard.nextLine();

        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        int input = CountWord.countWord("");
        System.out.println("Jumlah kata yang terdapat pada kalimat tersebut adalah: " + input + " kata");
    }
}
