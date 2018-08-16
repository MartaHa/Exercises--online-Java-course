package pl.MartaHa.Files.Serializable;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SerializedNames implements Serializable {

    private static List<String> GetNames() throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<String> names = new LinkedList();
        String name = "";


        while (true) {
            System.out.println("Enter a name:");
            name = scanner.nextLine();
            if (name.equals("STOP")) {
                break;
            }

            names.add(name);
        }

        return names;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("names.bin"));
            output.writeObject(GetNames());
        } catch (Exception e) {
            e.getStackTrace();
        }

        List<String> namesFromUser = null;

        try {
            ObjectInputStream input = new ObjectInputStream((new FileInputStream("names.bin")));
            namesFromUser = (List<String>) input.readObject();
        } catch (Exception e) {
            e.getStackTrace();
        }

        for (String n : namesFromUser) {
            System.out.println(n);

        }
    }
}