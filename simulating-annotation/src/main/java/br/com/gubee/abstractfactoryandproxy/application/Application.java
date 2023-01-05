package br.com.gubee.abstractfactoryandproxy.application;

import br.com.gubee.abstractfactoryandproxy.enums.UserFactoryEnum;
import br.com.gubee.abstractfactoryandproxy.factory.UserFactory;
import br.com.gubee.abstractfactoryandproxy.model.User;

public class Application {
    public static void main(String[] args) {
        User user = UserFactory.getFactory(UserFactoryEnum.PROXY).create();
        user.persistsIntoDatabase();

        User user2 = UserFactory.getFactory().create();
        user2.persistsIntoDatabase();

        User user3 = UserFactory.getFactory(UserFactoryEnum.NON_PROXY).create();
        user3.persistsIntoDatabase();
    }
}
