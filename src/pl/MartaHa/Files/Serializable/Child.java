package pl.MartaHa.Files.Serializable;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Child extends Human {

    public Child(String name, Integer age) {
        super(name, age);
    }

    private void writeObject(ObjectOutputStream output) throws IOException {
        throw new NotSerializableException("Not serializable!");
    }

    private void readObject(ObjectInputStream input) throws IOException {
        throw new NotSerializableException("Not serializable!");
    }
}
