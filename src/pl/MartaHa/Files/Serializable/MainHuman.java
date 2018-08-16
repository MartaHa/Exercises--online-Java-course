package pl.MartaHa.Files.Serializable;

import java.io.*;

public class MainHuman {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //testingHuman

        Human human = new Human("Anna", 23);
        human.setLegs(4);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("human.bin"))) {
            output.writeObject(human);
        }

        try (ObjectInputStream input = new ObjectInputStream((new FileInputStream("human.bin")))) {
            Human human2 = (Human) input.readObject();
            System.out.println(human2.getAge());
            System.out.println(human2.getLegs());
            System.out.println(human2.getName());
        }


        //testing Child not Serialiable

        Child child = new Child("Antoine", 4);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("child.bin"))) {
            output.writeObject(child);
        }

        try (ObjectInputStream input = new ObjectInputStream((new FileInputStream("child.bin")))) {
            Child child2 = (Child) input.readObject();
            System.out.println(child2.getAge());
            System.out.println(child2.getName());
        }
    }


}
