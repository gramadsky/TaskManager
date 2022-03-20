package by.gramadsky.task_manager.model;

public class OneTimeTask extends Task {

    private String dateOfCompletion;
    private String priority;

    public OneTimeTask(String title, String category, String dateOfCompletion, String priority) {
        super(title, category);
        this.dateOfCompletion = dateOfCompletion;
        this.priority = priority;
    }

    public String getPurchase() {
        return dateOfCompletion;
    }

    public String getWish() {
        return priority;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DateOfCompletion: " + dateOfCompletion + "\r\n" +
                "Priority: " + priority + "\r\n";

    }

    @Override
    public void complete() {
        System.out.println("Task is completed!");

    }
}
