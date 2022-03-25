package by.gramadsky.task_manager.model;

public class OneTimeTask extends Task {

    private String dateOfCompletion;
    private PriorityLevel priority;

    public OneTimeTask(String title, CategoryOptions category, String dateOfCompletion, PriorityLevel priority) {
        super(title, category);
        this.dateOfCompletion = dateOfCompletion;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DateOfCompletion: " + dateOfCompletion + "\r\n" +
                "Priority: " + priority.toString().toLowerCase() + "\r\n";

    }

    @Override
    public void complete() {
        System.out.println("Task is completed!");

    }
}
