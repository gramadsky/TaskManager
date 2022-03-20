package by.gramadsky.task_manager.app;

import by.gramadsky.task_manager.model.OneTimeTask;
import by.gramadsky.task_manager.model.RepeatableTask;

public class App {
    public static void main(String[] args) {
        OneTimeTask task = new OneTimeTask("car repair", "work", "28.03", "important");
        System.out.println(task);

        RepeatableTask task2 = new RepeatableTask("training", "personal", 3,1);
        System.out.println(task2);

    }
}
