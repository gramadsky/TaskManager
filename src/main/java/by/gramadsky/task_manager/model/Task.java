package by.gramadsky.task_manager.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public abstract class Task implements Completable, Comparable<Task>, Serializable {

    private String title;
    private CategoryOptions category;
    private LocalDate date;

    LocalDate today = LocalDate.now();

    public int periodMonths() {
        Period period = Period.between(today, date);
        return period.getMonths();
    }

    public int periodDays() {
        Period period = Period.between(today, date);
        return period.getDays();
    }

    protected Task() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryOptions getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = CategoryOptions.valueOf(category);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    protected Task(String title, CategoryOptions category, LocalDate date) {
        this.title = title;
        this.category = category;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Title: " + title + ",  " + "category: " + category.toString().toLowerCase() + ",  " + "date: " + date + ",  ";
    }

    @Override
    public int compareTo(Task task) {
        return getDate().compareTo(task.getDate());
    }


}
