package by.gramadsky.task_manager.app;

import by.gramadsky.task_manager.model.*;

public class App {
    public static void main(String[] args) {

        OneTimeTask task = new OneTimeTask("car repair", CategoryOptions.WORK,
                "28.03", PriorityLevel.VERY_IMPORTANT);
        System.out.println(task);

        RepeatableTask task2 = new RepeatableTask("training", CategoryOptions.PERSONAL, 3, 1);
        System.out.println(task2);


        User user1 = new User.Builder()
                .setName("Bob")
                .setAge(13)
                .build();
        System.out.println(user1);

        User user2 = new User(123);
        System.out.println(user2);

    }
}
