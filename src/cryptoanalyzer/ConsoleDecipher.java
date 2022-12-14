package cryptoanalyzer;

import java.io.IOException;
import java.util.Scanner;

import static navigation.MenuPhrases.ALPHABET;
import static navigation.MenuPhrases.OFFSET_NUMBER;
import static cryptoanalyzer.UniversalCipherMethod.universalCipherMethod;

public class ConsoleDecipher {

    public static void consoleDecipher() throws IOException {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < text.length(); j++) {
            sb.append(universalCipherMethod(text.charAt(j), ALPHABET.length()-OFFSET_NUMBER));
        }  System.out.println(sb);
    }
}