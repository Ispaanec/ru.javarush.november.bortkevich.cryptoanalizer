package cryptoanalyzer;

import java.io.IOException;
import static navigation.MenuPhrases.*;


public class UniversalCipherMethod {
    public static char universalCipherMethod(char symbol, int offset) throws IOException {

        if (ALPHABET.indexOf(Character.toLowerCase(symbol)) != -1) {
            return ALPHABET.charAt((ALPHABET.indexOf(Character.toLowerCase(symbol)) + offset) % ALPHABET.length());
        } else {
            return symbol;
        }
        //This method is universal.
        //For Caesar encryption, the offset parameter is set to 3.
        //For decryption, the set parameter = (your alphabet.length - 3).
    }
}