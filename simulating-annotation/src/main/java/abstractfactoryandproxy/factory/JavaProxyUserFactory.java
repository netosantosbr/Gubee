package abstractfactoryandproxy.factory;

import abstractfactoryandproxy.model.JavaProxyUser;
import abstractfactoryandproxy.model.User;

public class JavaProxyUserFactory implements UserFactory {
    @Override
    public User createUser(String name, int age) {
        return new JavaProxyUser(name, age);
    }
}
