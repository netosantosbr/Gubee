package br.com.gubee.abstractfactoryandproxy.factory;

import br.com.gubee.abstractfactoryandproxy.model.SimpleUser;
import br.com.gubee.abstractfactoryandproxy.model.User;
import br.com.gubee.abstractfactoryandproxy.proxy.UserProxy;

public class ProxyUserFactory implements UserFactory {

    @Override
    public User create() {
        return new UserProxy(new SimpleUser());
    }
}
