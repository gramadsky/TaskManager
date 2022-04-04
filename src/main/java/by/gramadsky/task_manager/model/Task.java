package by.gramadsky.task_manager.model;

import java.util.Objects;

public abstract class Task implements Completable, Comparable<Task> {

    private String title;
    private CategoryOptions category;
    private String date;

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

    public void setCategory(CategoryOptions category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    protected Task(String title, CategoryOptions category, String date) {
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

    public void setCategory(String category) {
        this.category = CategoryOptions.valueOf(category);

    }
}
