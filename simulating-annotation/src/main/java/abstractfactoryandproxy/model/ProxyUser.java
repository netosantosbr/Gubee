package abstractfactoryandproxy.model;

import abstractfactoryandproxy.annotation.Transaction;

public class ProxyUser implements User {
    private String name;
    private int age;

    public ProxyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    @Transaction
    public boolean persistsIntoDatabase() {
        if(this.name.length() >= 3) {
            System.out.printf("ProxyUser (name: %s and age: %s) persisted into database.\n", this.name, this.age);
        } else {
            throw new IllegalArgumentException();
        }

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
