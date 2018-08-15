package pl.MartaHa.Files.Files;

import java.io.*;
import java.util.Scanner;


public class BinaryFileOutput {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DataOutputStream outputStream = null;


        System.out.println("Enter your file name:");
        String fileName = scanner.nextLine();

        System.out.println(("Enter your day of birth: "));
        String day = scanner.nextLine();

        System.out.println(("Enter your month of Birth: "));
        String month = scanner.nextLine();

        System.out.println("Enter your year of birth: ");
        String year = scanner.nextLine();

        try {

            while (true) {


                outputStream = new DataOutputStream(new FileOutputStream(fileName));
                outputStream.writeInt(Integer.parseInt(day));
                outputStream.writeInt(Integer.parseInt(month));
                outputStream.writeInt(Integer.parseInt(year));
            }
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }

    }
}
