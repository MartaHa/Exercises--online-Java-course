package pl.MartaHa.Files.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShowFile {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        BufferedReader stringReader = null;
        int count = 0;

        System.out.println("Enter the file path here:");
        String path = scanner.nextLine();


        try {
            stringReader = new BufferedReader(new FileReader(path));
            while (true) {
                String read = stringReader.readLine();
                if (read == null) {
                    break;
                } else {
                    System.out.println(read);
                    count = count++;
                }

            }

        } finally {
            if (stringReader != null) {
                System.out.println(count);
                stringReader.close();
            }
        }
        System.out.println("The text has: " + count + " lines");

    }
}
