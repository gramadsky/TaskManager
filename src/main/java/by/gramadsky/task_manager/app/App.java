package by.gramadsky.task_manager.app;

import by.gramadsky.task_manager.db.DB;
import by.gramadsky.task_manager.model.*;
import by.gramadsky.task_manager.util.TaskCreator;

import java.util.*;

import static by.gramadsky.task_manager.db.DB.taskList;

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

        System.out.println("Hello, enter you name: ");
        String nameUser = Scanner.nextLine();

        while (!nameUser.equals("Tom")) {
            System.out.println("Invalid name, try again: ");
            nameUser = Scanner.nextLine();
        }
        System.out.println("Greatest, Tom!");
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println(new StringBuilder()
                    .append("If you want to:  - see your to-do list, press 1 \n")
                    .append("                 - add a task, press 2 \n")
                    .append("                 - sort a task, press 3 \n")
                    .append("                 - stop a program, press 4"));

            int number = Scanner.nextInt();
            switch (number) {
                case 1:
                    DB.printAllTasks();
                    break;
                case 2:
                    System.out.println("What the task you want? 1 - One time task 2 - Repeatable task");

                    int numb = Scanner.nextInt();

                    if (numb == 1) {
                        TaskCreator.createOneTimeTask();
                    }
                    if (numb == 2) {
                        TaskCreator.createRepeatableTask();
                    } else {
                        System.out.println("Invalid input");
                    }
                    System.out.println("Your to-do list is now: ");
                    DB.printAllTasks();
                    break;
                case 3:
                    DB.sorted();
                    break;
                case 4:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
