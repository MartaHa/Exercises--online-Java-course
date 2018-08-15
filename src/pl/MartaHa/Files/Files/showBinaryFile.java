package pl.MartaHa.Files.Files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class showBinaryFile {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DataInputStream inputStream = null;
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Enter your file path: ");
        String path = scanner.nextLine();

        try {
            inputStream = new DataInputStream(new FileInputStream(path));
            day = inputStream.readInt();
            month = inputStream.readInt();
            year = inputStream.readInt();

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        System.out.println("Date of birth: day : " + day + " ,month: " + month + ",year: " + year);


    }
}
