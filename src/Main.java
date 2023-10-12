import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFName = "INPUT.TXT";
        Scanner scanner = new Scanner(new File(inputFName));
        int k = scanner.nextInt();
        char g = ('G');
        char c = ('C');
        char v = ('V');

        for (int i = 0; i < k; i++) {
            String OrderFlowers = String.valueOf(g+c+v);
        }



        String OrderFlowers;
        OrderFlowers = "VGC";
        String outputFName = "OUTPUT.TXT";

       String s = String.valueOf(OrderFlowers);
       Files.writeString(Path.of(outputFName), s);
    }
}