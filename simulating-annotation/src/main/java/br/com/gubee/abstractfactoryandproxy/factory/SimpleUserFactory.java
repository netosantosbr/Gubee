package br.com.gubee.abstractfactoryandproxy.factory;

import br.com.gubee.abstractfactoryandproxy.model.SimpleUser;
import br.com.gubee.abstractfactoryandproxy.model.User;

public class SimpleUserFactory implements UserFactory {

    @Override
    public User create() {
        return new SimpleUser();
    }

}
