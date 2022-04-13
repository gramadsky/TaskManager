package by.gramadsky.task_manager.app;

import by.gramadsky.task_manager.model.*;
import by.gramadsky.task_manager.util.TaskUtility;

import java.util.*;

import static by.gramadsky.task_manager.util.TaskUtility.taskList;


public class App {

    public static void main(String[] args) {

        OneTimeTask carRepair = new OneTimeTask("car repair", CategoryOptions.WORK,
                "20.03", PriorityLevel.VERY_IMPORTANT);
        taskList.add(carRepair);

        OneTimeTask theaterVisit = new OneTimeTask("theater visit", CategoryOptions.PERSONAL,
                "29.03", PriorityLevel.MEDIUM);
        taskList.add(theaterVisit);

        OneTimeTask buyPresent = new OneTimeTask("buy present", CategoryOptions.HOME,
                "22.03", PriorityLevel.MEDIUM);
        taskList.add(buyPresent);

        RepeatableTask training = new RepeatableTask("training", CategoryOptions.PERSONAL,
                "10.03", 3);
        taskList.add(training);

        Scanner Scanner = new Scanner(System.in);

        User<Integer> user = new User.Builder()
                .setName("Tom")
                .setAge(33)
                .build();
        user.setId(343);

        System.out.println("Hello " + user.getName() + ", please enter your password: ");
        String password = Scanner.nextLine();

        while (!password.equals("123456")) {
            System.out.println("Invalid password, try again: ");
            password = Scanner.nextLine();
        }
        System.out.println("Greatest, " + user.getName() + "!");

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
