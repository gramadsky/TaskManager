package by.gramadsky.task_manager.util;

import by.gramadsky.task_manager.exception.IncorrectAgeException;
import by.gramadsky.task_manager.exception.IncorrectFormatException;
import by.gramadsky.task_manager.model.User;

import java.util.Scanner;

public class UserCreator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void createUser() {
        System.out.println("Hello! Enter your details");
        User<Integer> newUser = new User<>();
        newUser.setName(getNameFromUser());
        newUser.setAge(getAgeFromUser());
        newUser.setId(getIdFromUser());
        System.out.println("Hello " + newUser.getName() + ", please enter your password: ");
    }

    public static String getNameFromUser() {
        System.out.print("Name: ");
        return SCANNER.nextLine();
    }

    private static int getAgeFromUser() {
        System.out.print("Age: ");
        String line = SCANNER.nextLine();
        int age = Integer.parseInt(line);
        try {
            if (age < 0) {
                throw new IncorrectAgeException("Age can't be less than 0. Default value: 20");
            }
        } catch (NumberFormatException e) {
            throw new IncorrectFormatException("Age has incorrect format");
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
            return 20;
        }
        return age;
    }

    private static int getIdFromUser() {
        System.out.print("Id: ");
        return SCANNER.nextInt();
    }
}
