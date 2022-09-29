package singleton;

import java.io.*;

public class Demo {

    static void saveToFile(BasicSingleton singleton,
                           String filename) throws Exception {


        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);

        }
    }

    static BasicSingleton readFromFIle(String filename) throws Exception {

        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            return (BasicSingleton) in.readObject();

        }
    }

    public static void main(String[] args) throws Exception {
//        BasicSingleton singleton = BasicSingleton.getInstance();
//
//        singleton.setValue(123);
//        System.out.println(singleton.getValue());

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        String filename = "singleton.bin";
        saveToFile(singleton, filename);


        singleton.setValue(222);
        BasicSingleton singleton1 = readFromFIle(filename);

        System.out.println(singleton == singleton1);
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());


    }
}
