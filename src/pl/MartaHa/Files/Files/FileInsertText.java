package pl.MartaHa.Files.Files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInsertText {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your path directory:");
        String path = scanner.nextLine();
        String fileInput = "";

        FileWriter fileWriter = null;

        try {

            System.out.println("Enter a line of text or write \"- \" ");
            fileWriter = new FileWriter(path);

            while (true) {
                fileInput = scanner.nextLine();
                if (fileInput.equals("-")) {
                    break;
                }

                fileWriter.write(fileInput);
                fileWriter.write(System.lineSeparator());

            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}