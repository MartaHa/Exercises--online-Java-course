package pl.MartaHa.Files.Serializable;

import java.io.*;

public class Robot implements Externalizable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int runTime;

    public Robot() {
    }

    public Robot(String name, int runTime) {
        this.name = name;
        this.runTime = runTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(String.valueOf(runTime));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        runTime = Integer.parseInt(in.readUTF());
    }
}
