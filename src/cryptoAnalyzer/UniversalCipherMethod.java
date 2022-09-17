package cryptoAnalyzer;

import java.io.IOException;

import static cryptoAnalyzer.TextFiles.alphabet;

public class UniversalCipherMethod {
    public static char universalCipherMethod(char symbol, int offset) throws IOException {
        if (alphabet.indexOf(Character.toLowerCase(symbol)) != -1) {
            return alphabet.charAt((alphabet.indexOf(Character.toLowerCase(symbol)) + offset) % alphabet.length());
        } else {
            return symbol;
        } //This method is universal. For Caesar encryption, the offset parameter is set to 3.
        // For decryption, the parameter is set to 31 (your alphabet.length - 3).
        // You can change the value of the offset parameter based on the length of your alphabet.
    }
}