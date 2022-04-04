package by.gramadsky.task_manager.db;

import by.gramadsky.task_manager.model.Task;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DB {

    public static Set<Task> taskList = new HashSet<>();

    public static void sorted() {
        Set<Task> sortedSet = new TreeSet<>(taskList);
        System.out.println("Sorted task:\n" + sortedSet);
    }

    public static void printAllTasks(){
        taskList.forEach(task -> System.out.println(task));
    }
}
