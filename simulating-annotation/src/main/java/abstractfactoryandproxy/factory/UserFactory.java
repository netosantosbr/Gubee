package abstractfactoryandproxy.factory;

import abstractfactoryandproxy.enums.UserFactoryEnum;
import abstractfactoryandproxy.model.User;

public interface UserFactory {
    static UserFactory create() {
        return new ProxyUserFactory();
    }

    static UserFactory create(UserFactoryEnum factoryEnum) {
        return factoryEnum.getUserFactory();
    }

    User createUser(String name, int age);
}
