package by.gramadsky.task_manager.model;

public class User<T> {
    private String name;
    private int age;
    private T id;

    public User() {
    }


    public void setId(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public User(T id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "User: \r\n" +
                "name = " + name + "\r\n" +
                "age = " + age + "\r\n" +
                "id = " + id + "\r\n";
    }

    public static class Builder {
        private User newUser;

        public Builder() {

            newUser = new User();
        }

        public Builder setName(String name) {
            newUser.name = name;
            return this;
        }

        public Builder setAge(int age) {
            newUser.age = age;
            return this;
        }

        public User build() {
            return newUser;
        }
    }
}
