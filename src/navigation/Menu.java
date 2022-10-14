package navigation;

import java.io.IOException;
import java.util.Scanner;

import static cryptoanalyzer.BruteForce.bruteForce;
import static cryptoanalyzer.ConsoleCipher.consoleCipher;
import static cryptoanalyzer.ConsoleDecipher.consoleDecipher;
import static cryptoanalyzer.FileCipher.fileCipher;
import static cryptoanalyzer.FileDecipher.fileDecipher;
import static navigation.MenuPhrases.*;

public class Menu {
    private final Scanner sc = new Scanner(System.in);

    public void menu() throws IOException {

            System.out.println(WELCOME_PHRASE);
            while (true) {
                System.out.println(METHOD_CHOICE);
                switch (sc.next().toLowerCase()) {
                    case ("1") -> {
                        System.out.println(SECOND_METHOD_CHOICE);
                        if (sc.nextInt() == 5) {
                            System.out.print("Enter your text for cipher: \n");
                            consoleCipher();
                        } else if (sc.nextInt() == 6) {
                                System.out.print("Enter the path to File.txt: \n");
                                fileCipher();
                                System.out.println(CHECK);
                            } else {
                                System.out.println(WRONG_KEY);
                            }
                        }

                    case ("2") -> {
                        System.out.println(SECOND_METHOD_CHOICE);
                        if (sc.nextInt() == 5) {
                            System.out.print("Enter your text for decipher: \n");
                            consoleDecipher();
                        } else if (sc.nextInt() == 6) {
                            System.out.print("Enter the path to File.txt: \n");
                            fileDecipher();
                            System.out.println(CHECK);
                        } else {
                            System.out.println(WRONG_KEY);
                        }
                    }

                    case ("3") -> {
                        System.out.println("Enter FULL(ABSOLUTE) path to the txt.file for brute force method:\n");
                        bruteForce();
                        System.out.println("\nCheck complete list. This list should contain decoded text:\n");
                    }

                    case ("4") -> System.exit(0);
                    default -> System.out.println(WRONG_KEY);
                }
            }
    }
}
