package br.com.gubee.abstractfactoryandproxy.enums;


import br.com.gubee.abstractfactoryandproxy.factory.JavaProxyUserFactory;
import br.com.gubee.abstractfactoryandproxy.factory.ProxyUserFactory;
import br.com.gubee.abstractfactoryandproxy.factory.SimpleUserFactory;
import br.com.gubee.abstractfactoryandproxy.factory.UserFactory;

public enum UserFactoryEnum {
    PROXY(new ProxyUserFactory()), NON_PROXY(new SimpleUserFactory()), JAVA_PROXY(new JavaProxyUserFactory());

    UserFactory userFactory;

    UserFactoryEnum(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public UserFactory getUserFactory() {
        return this.userFactory;
    }
}
