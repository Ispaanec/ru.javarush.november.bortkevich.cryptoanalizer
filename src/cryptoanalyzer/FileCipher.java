package cryptoanalyzer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static navigation.MenuPhrases.OFFSET_NUMBER;
import static cryptoanalyzer.UniversalCipherMethod.universalCipherMethod;

public class FileCipher {

    public static void fileCipher() {

        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        try (   FileReader reader = new FileReader(filePath);
                FileWriter writer = new FileWriter(filePath + "copy")) {

            char[] buffer = new char[filePath.length()];
            while (reader.ready()) {
                int result = reader.read(buffer);
                for (int i = 0; i < result; i++) {
                    writer.write(universalCipherMethod(buffer[i], OFFSET_NUMBER));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}