package by.gramadsky.task_manager.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class OneTimeTask extends Task implements Serializable {

    private PriorityLevel priority;

    public OneTimeTask() {
    }


    public void setPriority(PriorityLevel priority) {
        this.priority = priority;
    }


    public PriorityLevel getPriority() {
        return priority;
    }

    public OneTimeTask(String title, CategoryOptions category, LocalDate date, PriorityLevel priority) {
        super(title, category, date);
        this.priority = priority;
    }

    @Override
    public String toString() {
        return super.toString() +
                "priority: " + priority.toString().toLowerCase();
    }

    @Override
    public void complete() {
        System.out.println("Task is completed!");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OneTimeTask that = (OneTimeTask) o;
        return priority == that.priority && getDate().equals(that.getDate()) &&
                getCategory() == that.getCategory() && getTitle().equals(that.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, getCategory(), getTitle(), getDate());
    }
}
