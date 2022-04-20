package by.gramadsky.task_manager.util;

import by.gramadsky.task_manager.exception.IncorrectCategoryOptionsException;
import by.gramadsky.task_manager.exception.IncorrectPriorityLevelException;
import by.gramadsky.task_manager.model.CategoryOptions;
import by.gramadsky.task_manager.model.OneTimeTask;
import by.gramadsky.task_manager.model.PriorityLevel;
import by.gramadsky.task_manager.model.RepeatableTask;

import java.time.LocalDate;
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

    private static LocalDate getDate() {
        System.out.println("Date (yyyy-mm-dd): ");
        return LocalDate.parse(SCANNER.nextLine());
    }

    private static String getPriorityLevel() {
        System.out.println("Priority level (VERY_IMPORTANT, MEDIUM, UNIMPORTANT): ");
        String priority = SCANNER.nextLine();
        boolean isItTrue = priority.equals("VERY_IMPORTANT") || priority.equals("MEDIUM")
                || priority.equals("UNIMPORTANT");
        try {
            if (!isItTrue) {
                throw new IncorrectPriorityLevelException("Incorrect priority level! " +
                        "default value - MEDIUM");
            }
            return priority;
        } catch (IncorrectPriorityLevelException e) {
            System.out.println(e.getMessage());
            return String.valueOf(PriorityLevel.MEDIUM);
        }
    }

    private static Integer getPeriodicity() {
        System.out.println("Times a week: ");
        return SCANNER.nextInt();
    }

    private static String getCategory() {
        System.out.println("Category (WORK, PERSONAL, HOME, WISH, PURCHASES): ");
        String category = SCANNER.nextLine();
        boolean isItTrue = category.equals("WORK") || category.equals("PERSONAL") || category.equals("HOME")
                || category.equals("WISH") || category.equals("PURCHASES");
        try {
            if (!isItTrue) {
                throw new IncorrectCategoryOptionsException("Incorrect category options! " +
                        "default value - HOME");
            }
            return category;
        } catch (IncorrectCategoryOptionsException e) {
            System.out.println(e.getMessage());
            return String.valueOf(CategoryOptions.HOME);
        }
    }
}