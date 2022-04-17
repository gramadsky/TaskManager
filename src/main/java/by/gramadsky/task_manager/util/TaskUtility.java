package by.gramadsky.task_manager.util;

import by.gramadsky.task_manager.model.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static by.gramadsky.task_manager.model.CategoryOptions.PERSONAL;


public class TaskUtility {

    public static Set<Task> taskList = new HashSet<>();

    public static void userTasks() {
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
    }

    public static void printMenu() {
        System.out.println(new StringBuilder()
                .append("If you want to: 1 - see your to-do list \n")
                .append("                2 - add a task \n")
                .append("                3 - sort a task \n")
                .append("                4 - filter a task \n")
                .append("                5 - see Title a task \n")
                .append("                6 - stop a program"));
    }

    public static void printAllTasks() {
        taskList.forEach(System.out::println);
    }

    public static void addTask() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("What the task you want? 1 - One time task 2 - Repeatable task");

        int number = Scanner.nextInt();

        switch (number) {
            case 1:
                TaskCreator.createOneTimeTask();
                break;
            case 2:
                TaskCreator.createRepeatableTask();
                break;
            default:
                System.out.println("Invalid input!!!!!");
        }
    }

    public static void sorted() {
        taskList.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .forEach(task -> System.out.println(task.getTitle() + " - " + task.getDate()));
    }

    public static void filtered() {
        taskList.stream()
                .filter(task -> task.getCategory().equals(PERSONAL))
                .forEach(System.out::println);
    }

    public static void printTitle() {
        taskList.stream()
                .map(task -> task.getTitle())
                .forEach(System.out::println);

    }
}
