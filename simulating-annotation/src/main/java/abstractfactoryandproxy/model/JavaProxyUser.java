package abstractfactoryandproxy.model;

public class JavaProxyUser implements User {
    private String name;
    private int age;

    public JavaProxyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean persistsIntoDatabase() {
        System.out.printf("JavaProxyUser (name: %s and age: %s) persisted into database.", this.name, this.age);
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
