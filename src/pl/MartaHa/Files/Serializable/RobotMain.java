package pl.MartaHa.Files.Serializable;

import java.io.*;

public class RobotMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Robot robot = new Robot("John", 7);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("externalizable.bin"))) {
            output.writeObject(robot);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("externalizable.bin"))) {
            Robot robot1 = (Robot) input.readObject();
            System.out.println(robot1.getName());
            System.out.println(robot1.getRunTime());

        }

    }
}
