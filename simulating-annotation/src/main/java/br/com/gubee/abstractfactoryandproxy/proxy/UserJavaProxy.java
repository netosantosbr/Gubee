package br.com.gubee.abstractfactoryandproxy.proxy;

import br.com.gubee.abstractfactoryandproxy.model.User;

import java.lang.reflect.Proxy;

public class UserJavaProxy implements User {

    private User realInstance;

    private User userProxyInstance;

    public UserJavaProxy(User user) {
        this.realInstance = user;

        this.userProxyInstance = (User) Proxy.newProxyInstance(
                User.class.getClassLoader(),
                new Class<?>[] {User.class},
                new UserJavaProxyInvocationHandler(realInstance));
    }

    @Override
    public boolean persistsIntoDatabase() {
        return userProxyInstance.persistsIntoDatabase();
    }
}
