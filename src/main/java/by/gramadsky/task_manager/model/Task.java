package by.gramadsky.task_manager.model;

public abstract class Task implements Completable {

    private String title;
    private String category;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    protected Task(String title, String category) {
        this.title = title;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\r\n" +
                "Category: " + category + "\r\n";
    }
}
