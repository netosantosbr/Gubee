package br.com.gubee.abstractfactoryandproxy.factory;

import br.com.gubee.abstractfactoryandproxy.model.User;

public class JavaProxyUserFactory implements UserFactory {

    @Override
    public User create() {
        return null; //Deve retornar um new SimpleUser() mas usando Java Proxy
    }
}
