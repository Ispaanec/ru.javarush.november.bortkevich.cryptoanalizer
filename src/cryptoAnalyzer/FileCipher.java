package cryptoAnalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static cryptoAnalyzer.UniversalCipherMethod.universalCipherMethod;

public class FileCipher {

    public FileCipher() throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        try (   FileReader reader = new FileReader(filePath);
                FileWriter writer = new FileWriter(filePath + "copy")) {

            char[] buffer = new char[210000000];
            while (reader.ready()) {
                int result = reader.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    writer.write(universalCipherMethod(buffer[i], 3));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}