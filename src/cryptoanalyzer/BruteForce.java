package cryptoanalyzer;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static navigation.MenuPhrases.*;
import static cryptoanalyzer.UniversalCipherMethod.universalCipherMethod;

public class BruteForce {

    public static void bruteForce () {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        try (FileReader reader = new FileReader(filePath)) {
            char[] buffer = new char[filePath.length()];
            while (reader.ready()) {
                int result = reader.read(buffer);
                for (int j = 0; j <= ALPHABET.length(); j++) {
                    for (int i = 0; i < result; i++) {
                        System.out.print((universalCipherMethod(buffer[i], j)));
                    } System.out.println();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

