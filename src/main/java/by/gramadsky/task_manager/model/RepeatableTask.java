package by.gramadsky.task_manager.model;

public class RepeatableTask extends Task {

    private int howManyTimesAWeek;
    private int howLong;

    public RepeatableTask(String title, String category, int howManyTimesAWeek, int howLong) {

        super(title, category);
        this.howManyTimesAWeek = howManyTimesAWeek;
        this.howLong = howLong;
    }

    @Override
    public String toString() {
        return super.toString() +
                "HowManyTimesAWeek: " + howManyTimesAWeek + "\r\n" +
                "HowLong: " + howLong + "\r\n";
    }

    @Override
    public void complete() {
        System.out.println("Task is completed!");
    }
}
