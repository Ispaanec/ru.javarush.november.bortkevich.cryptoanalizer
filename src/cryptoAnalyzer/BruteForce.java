package cryptoAnalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static cryptoAnalyzer.UniversalCipherMethod.universalCipherMethod;

public class BruteForce {

    public BruteForce () throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        try (FileReader reader = new FileReader(filePath)) {
            char[] buffer = new char[210000000];
            while (reader.ready()) {
                int result = reader.read(buffer);
                for (int j = 0; j <= 33; j++) {
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

