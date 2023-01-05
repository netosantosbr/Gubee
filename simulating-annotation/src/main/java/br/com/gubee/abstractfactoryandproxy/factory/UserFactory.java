package br.com.gubee.abstractfactoryandproxy.factory;

import br.com.gubee.abstractfactoryandproxy.enums.UserFactoryEnum;
import br.com.gubee.abstractfactoryandproxy.model.User;

public interface UserFactory {
    static UserFactory getFactory() {
        return new ProxyUserFactory();
    }
    static UserFactory getFactory(UserFactoryEnum userFactoryEnum) {
        return userFactoryEnum.getUserFactory();
    }

    User create();
}
