package cryptoanalyzer;

import java.io.IOException;
import java.util.Scanner;

import static cryptoanalyzer.MenuPhrases.OFFSET_NUMBER;
import static cryptoanalyzer.UniversalCipherMethod.universalCipherMethod;

public class ConsoleCipher {

    public static void consoleCipher() throws IOException {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder();

            for (int j = 0; j < text.length(); j++) {
              sb.append(universalCipherMethod(text.charAt(j), OFFSET_NUMBER));
            }  System.out.println(sb);
    }
}
