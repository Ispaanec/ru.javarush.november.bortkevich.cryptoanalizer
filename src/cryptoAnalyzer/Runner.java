package cryptoAnalyzer;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Runner extends TextFiles {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(welcomePhrase);
        TimeUnit.SECONDS.sleep(3);
        System.out.println(methodChoose);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


            if (number == 1) {
                System.out.println(secondMethodChoose);
                if (sc.nextInt() == 5) {
                    System.out.print("Enter your text for cipher: \n");
                    ConsoleCipher consoleCipher = new ConsoleCipher();
                    consoleCipher();
                } else if (sc.nextInt() == 6) {
                    System.out.print("Enter the path to File.txt: \n");
                    FileCipher fileCipher = new FileCipher();
                    fileCipher();
                } else {
                    System.out.println(wrongKey);
                }
            } else if (number == 2) {
                System.out.println(secondMethodChoose);
                if (sc.nextInt() == 5) {
                    System.out.print("Enter your text for decipher: \n");
                    ConsoleDecipher consoleDecipher = new ConsoleDecipher();
                    consoleDecipher();
                } else if (sc.nextInt() == 6) {
                    System.out.print("Enter the path to File.txt: \n");
                    FileDecipher fileDecipher = new FileDecipher();
                    fileDecipher();
                } else {
                    System.out.println(wrongKey);
                }

            } else if (number == 3) {
                System.out.println("Enter the path to the File.txt to crack the ciphertext:\n");
                BruteForce bruteForce = new BruteForce();
                bruteForce();
                System.out.println("\nCheck complete list. It should contain decoded text:\n");

            } else if (number == 4) {
                System.exit(0);
            } else {
                System.out.println(wrongKey);
            }
        }


    private static void bruteForce() {
    }

    private static void fileDecipher() {
    }

    private static void fileCipher() {
    }

    private static void consoleDecipher() {
    }

    private static void consoleCipher() {
    }
}
