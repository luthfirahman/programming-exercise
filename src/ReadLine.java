import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
    public static String readLine(String namaFile) {
        String output = "";
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(namaFile)));

            for (int i = 0; i < 3; i++) {
                output = input.readLine();
                sb.append(output);
                sb.append("\n");
                System.out.println(output);
            }

        } catch (IOException e) {
            System.out.println("File tidak terbaca");
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String output = ReadLine.readLine("/Users/luthfirahman/Desktop/Terjadinya Danau Toba.txt");

    }
}
