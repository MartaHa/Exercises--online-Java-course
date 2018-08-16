package pl.MartaHa.Files.Serializable;

import java.io.*;
import java.util.Calendar;

public class Human2 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Human2 human2 = new Human2("John", 22);

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("human2.bin"));
            outputStream.writeObject(human2);
        } catch (Exception e) {
            e.getStackTrace();
        }


        try {
            ObjectInputStream inputStream = new ObjectInputStream((new FileInputStream(("human2.bin"))));
            Human2 human3 = (Human2) inputStream.readObject();
            System.out.println(human3.name);
            System.out.println(human3.age);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }


    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int birthYear = stream.readInt();
        age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        int birthYear = Calendar.getInstance().get(Calendar.YEAR) - age;
        stream.writeInt(birthYear);
    }


}
