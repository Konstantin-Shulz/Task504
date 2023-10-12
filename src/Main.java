import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static String main(String[] args) throws IOException {
        String inputFName = "INPUT.TXT";
        Scanner scanner = new Scanner(new File(inputFName));
        int k = scanner.nextInt();
        String pos;
        String pos1 = "VGC"; System.out.println(pos1);
        String pos2 = "CVG"; System.out.println(pos2);
        String pos3 = "GCV"; System.out.println(pos3);


            if (k % 3 == 0) {
                pos = pos3;
            }
           else {
               if (k % 3 == 2){
                   pos = pos2;
               }
               else pos = pos1;
            }


        String OrderFlowers = pos;
        String outputFName = "OUTPUT.TXT";

       String s = String.valueOf(OrderFlowers);
       Files.writeString(Path.of(outputFName), s);

    }
}