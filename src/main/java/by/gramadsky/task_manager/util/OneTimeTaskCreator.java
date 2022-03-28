package by.gramadsky.task_manager.util;

import by.gramadsky.task_manager.model.CategoryOptions;
import by.gramadsky.task_manager.model.OneTimeTask;
import by.gramadsky.task_manager.model.PriorityLevel;

import java.util.Scanner;


public class OneTimeTaskCreator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static OneTimeTask createTask() {
        System.out.println("Create new task");
        OneTimeTask task = new OneTimeTask();
        task.setCategory(CategoryOptions.HOME);
        task.setTitle(getTitleFromUser());
        task.setDateOfCompletion(getDateOfCompletion());
        task.setPriority(PriorityLevel.MEDIUM);
        return task;
    }

    private static String getTitleFromUser() {
        System.out.println("Title: ");
        return SCANNER.nextLine();
    }

    private static String getDateOfCompletion() {
        System.out.println("Date of completion: ");
        return SCANNER.nextLine();
    }
}
