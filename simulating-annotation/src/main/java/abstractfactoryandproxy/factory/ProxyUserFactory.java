package abstractfactoryandproxy.factory;

import abstractfactoryandproxy.model.ProxyUser;
import abstractfactoryandproxy.model.User;
import abstractfactoryandproxy.proxy.UserProxy;

public class ProxyUserFactory implements UserFactory {
    @Override
    public User createUser(String name, int age) {
        return new UserProxy(new ProxyUser(name, age));
    }

}
