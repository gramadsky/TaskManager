package by.gramadsky.task_manager.app;

import by.gramadsky.task_manager.model.*;
import by.gramadsky.task_manager.util.OneTimeTaskCreator;


public class App {
    public static void main(String[] args) {


        OneTimeTask carRepair = new OneTimeTask("car repair", CategoryOptions.WORK,
                "28.03", PriorityLevel.VERY_IMPORTANT);
        System.out.println(carRepair);

        RepeatableTask training = new RepeatableTask("training", CategoryOptions.PERSONAL, 3, 1);
        System.out.println(training);

        OneTimeTask taskFromUser = OneTimeTaskCreator.createTask();
        System.out.println(taskFromUser);


        User<String> user1 = new User.Builder()
                .setName("Bob")
                .setAge(13)
                .build();
        user1.setId("qq123");
        System.out.println(user1);

        User<Integer> user2 = new User.Builder()
                .setName("Tom")
                .setAge(33)
                .build();
        user2.setId(422);
        System.out.println(user2);


    }
}
