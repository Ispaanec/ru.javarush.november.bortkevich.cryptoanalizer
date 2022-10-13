package cryptoanalyzer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static cryptoanalyzer.MenuPhrases.*;
import static cryptoanalyzer.UniversalCipherMethod.universalCipherMethod;

public class FileDecipher {

    public static void fileDecipher(int offset) {

        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        try (FileReader reader = new FileReader(filePath);
             FileWriter writer = new FileWriter(filePath + "copy")) {

            char[] buffer = new char[filePath.length()];
            while (reader.ready()) {
                int result = reader.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    writer.write(universalCipherMethod(buffer[i], ALPHABET.length()-offset));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}