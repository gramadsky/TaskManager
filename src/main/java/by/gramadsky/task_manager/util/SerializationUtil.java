package by.gramadsky.task_manager.util;


import lombok.experimental.UtilityClass;

import java.io.*;
import java.util.Optional;

@UtilityClass
public class SerializationUtil {

    public void serialize(String filename, Object data) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public Optional<Object> deserialize(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return Optional.of(ois.readObject());
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
        return Optional.empty();
    }
}
