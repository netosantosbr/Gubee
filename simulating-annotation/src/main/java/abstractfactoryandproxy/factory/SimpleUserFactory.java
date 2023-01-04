package abstractfactoryandproxy.factory;

import abstractfactoryandproxy.model.SimpleUser;
import abstractfactoryandproxy.model.User;

public class SimpleUserFactory implements UserFactory {
    @Override
    public User createUser(String name, int age) {
        return new SimpleUser(name, age);
    }

}
