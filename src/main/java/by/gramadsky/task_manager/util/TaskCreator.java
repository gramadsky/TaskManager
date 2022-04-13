package by.gramadsky.task_manager.util;

import by.gramadsky.task_manager.model.OneTimeTask;
import by.gramadsky.task_manager.model.PriorityLevel;
import by.gramadsky.task_manager.model.RepeatableTask;


import java.util.Scanner;

import static by.gramadsky.task_manager.util.TaskUtility.taskList;


public class TaskCreator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void createOneTimeTask() {
        System.out.println("Create new one time task!");
        OneTimeTask newTask = new OneTimeTask();
        newTask.setTitle(getTitleFromUser());
        newTask.setCategory(getCategory());
        newTask.setDate(getDate());
        newTask.setPriority(PriorityLevel.valueOf(getPriorityLevel()));

        boolean b = taskList.stream()
                .anyMatch(task -> task.equals(newTask));
        if (!b) {
            taskList.add(newTask);
        } else {
            System.out.println("This task already exists!");
        }
    }

    public static void createRepeatableTask() {
        System.out.println("Create new repeatable task!");
        RepeatableTask newTask = new RepeatableTask();
        newTask.setTitle(getTitleFromUser());
        newTask.setCategory(getCategory());
        newTask.setDate(getDate());
        newTask.setPeriodicity(getPeriodicity());

        boolean b = taskList.stream()
                .anyMatch(task -> task.equals(newTask));
        if (!b) {
            taskList.add(newTask);
        } else {
            System.out.println("This task already exists!");
        }
    }


    private static String getTitleFromUser() {
        System.out.println("Title: ");
        return SCANNER.nextLine();
    }

    private static String getDate() {
        System.out.println("Date of completion: ");
        return SCANNER.nextLine();
    }

    private static String getPriorityLevel() {
        System.out.println("Priority level (VERY_IMPORTANT, MEDIUM, UNIMPORTANT): ");
        return SCANNER.nextLine();
    }

    private static Integer getPeriodicity() {
        System.out.println("Times a week: ");
        return SCANNER.nextInt();
    }

    private static String getCategory() {
        System.out.println("Category (WORK, PERSONAL, HOME, WISH, PURCHASES): ");
        return SCANNER.nextLine();
    }
}
