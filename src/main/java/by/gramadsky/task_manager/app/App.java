package by.gramadsky.task_manager.app;

import by.gramadsky.task_manager.util.TaskUtility;
import by.gramadsky.task_manager.util.UserCreator;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        TaskUtility.userTasks();

        UserCreator.createUser();

        String password = Scanner.nextLine();
        while (!password.equals("123456")) {
            System.out.println("Invalid password, try again: ");
            password = Scanner.nextLine();
        }
        System.out.println("Greatest!!!");

        boolean continueProgram = true;

        while (continueProgram) {
            TaskUtility.printMenu();
            int number = Scanner.nextInt();

            switch (number) {
                case 1:
                    TaskUtility.printAllTasks();
                    break;
                case 2:
                    TaskUtility.addTask();
                    break;
                case 3:
                    TaskUtility.sorted();
                    break;
                case 4:
                    TaskUtility.filtered();
                    break;
                case 5:
                    TaskUtility.printTitle();
                    break;
                case 6:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
