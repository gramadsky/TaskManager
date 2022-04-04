package by.gramadsky.task_manager.model;

import java.util.Objects;

public class RepeatableTask extends Task {

    private int periodicity;

    public RepeatableTask(String title, CategoryOptions category, String date, int periodicity) {
        super(title, category, date);
        this.periodicity = periodicity
        ;
    }

    public int getPeriodicity() {
        return periodicity;
    }


    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepeatableTask that = (RepeatableTask) o;
        return periodicity == that.periodicity && getDate().equals(that.getDate()) &&
                getCategory() == that.getCategory() && getTitle().equals(that.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodicity, getCategory(), getTitle(), getDate());
    }

    public RepeatableTask() {

    }

    @Override
    public String toString() {
        return super.toString() +
                "periodicity: " + periodicity + "\n";
    }

    @Override
    public void complete() {
        System.out.println("Task is completed!");
    }
}
