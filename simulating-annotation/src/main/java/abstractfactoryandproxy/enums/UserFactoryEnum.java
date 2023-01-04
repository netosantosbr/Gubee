package abstractfactoryandproxy.enums;

import abstractfactoryandproxy.factory.JavaProxyUserFactory;
import abstractfactoryandproxy.factory.ProxyUserFactory;
import abstractfactoryandproxy.factory.SimpleUserFactory;
import abstractfactoryandproxy.factory.UserFactory;

public enum UserFactoryEnum {
    PROXY(new ProxyUserFactory()),
    NON_PROXY(new SimpleUserFactory()),
    JAVA_PROXY(new JavaProxyUserFactory());

    UserFactory userFactory;

    UserFactoryEnum(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public UserFactory getUserFactory() {
        return this.userFactory;
    }
}
