import java.util.Scanner;

public class ShiftedArray {

    public static void leftShift(String[] inputArray, int n) {

        String temp;
        for (int i = 0; i < n; i++) {
            temp = inputArray[0];
            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j + 1];
            }
            inputArray[inputArray.length - 1] = temp;
        }
        printArray(inputArray);
    }

    public static void printArray(String[] inputArray) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputArray.length; i++) {
            sb.append(inputArray[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        String[] value = null;
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String[] words = input1.split(" ");
        Integer lenght = Integer.parseInt(words[0]);
        Integer rotation = Integer.parseInt(words[1]);
        String input2 = scan.nextLine();
        value = input2.split(" ");
        if (lenght == value.length) {
            leftShift(value, rotation);
        } else {
            System.out.println("Invalid lenght input");
        }
    }
}
