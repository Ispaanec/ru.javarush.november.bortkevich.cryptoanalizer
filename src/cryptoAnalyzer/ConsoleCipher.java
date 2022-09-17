package cryptoAnalyzer;

import java.io.IOException;
import java.util.Scanner;

import static cryptoAnalyzer.UniversalCipherMethod.universalCipherMethod;

public class ConsoleCipher {

    public ConsoleCipher() throws IOException {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();

        if (text.isEmpty()) {
            System.out.println("You entered an empty message");
        } else {
            for (int j = 0; j < text.length(); j++) {
                System.out.print(universalCipherMethod(text.charAt(j), 3));
            }
        }
    }
}

