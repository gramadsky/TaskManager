package by.gramadsky.task_manager.util;

import by.gramadsky.task_manager.model.User;

import java.util.Scanner;

public class UserCreator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void createUser() {
        System.out.println("Hello! Enter your details");
        User<Integer> newUser = new User();
        newUser.setName(getNameFromUser());
        newUser.setAge(getAgeFromUser());
        newUser.setId(getIdFromUser());
    }

    public static String getNameFromUser() {
        System.out.print("Name: ");
        return SCANNER.nextLine();
    }

    private static int getAgeFromUser() {
        System.out.print("Age: ");
        return SCANNER.nextInt();
    }

    private static int getIdFromUser() {
        System.out.print("Id: ");
        return SCANNER.nextInt();
    }
}
