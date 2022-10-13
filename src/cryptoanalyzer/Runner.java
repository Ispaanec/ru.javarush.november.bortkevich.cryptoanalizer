package cryptoanalyzer;

import java.io.IOException;
import java.util.Scanner;

import static cryptoanalyzer.BruteForce.bruteForce;
import static cryptoanalyzer.ConsoleCipher.consoleCipher;
import static cryptoanalyzer.ConsoleDecipher.consoleDecipher;
import static cryptoanalyzer.FileCipher.fileCipher;
import static cryptoanalyzer.FileDecipher.fileDecipher;
import static cryptoanalyzer.MenuPhrases.*;


public class Runner {

    public static void main(String[] args) throws IOException {
        System.out.println(WELCOME_PHRASE);
        System.out.println(METHOD_CHOICE);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

            if (number == 1) {
                System.out.println(SECOND_METHOD_CHOICE);
                if (sc.nextInt() == 5) {
                    System.out.print("Enter your text for cipher: \n");
                    consoleCipher(OFFSET_NUMBER);
                }  else if (sc.nextInt() == 6) {
                    System.out.print("Enter the path to File.txt: \n");
                    fileCipher(OFFSET_NUMBER);
                    System.out.println(CHECK);
                } else {
                    System.out.println(WRONG_KEY);
                }


            } else if (number == 2) {
                System.out.println(SECOND_METHOD_CHOICE);
                if (sc.nextInt() == 5) {
                    System.out.print("Enter your text for decipher: \n");
                    consoleDecipher(ALPHABET.length()-OFFSET_NUMBER);
                } else if (sc.nextInt() == 6) {
                    System.out.print("Enter the path to File.txt: \n");
                    fileDecipher(OFFSET_NUMBER);
                    System.out.println(CHECK);
                } else {
                    System.out.println(WRONG_KEY);
                }


            } else if (number == 3) {
                System.out.println("Enter the path to the File.txt for crack the ciphertext:\n");
                bruteForce();
                System.out.println("\nCheck complete list. This list should contain decoded text:\n");


            } else if (number == 4) {
                System.exit(0);
            } else {
                System.out.println(WRONG_KEY);
            }
        }
    }
