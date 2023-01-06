package br.com.gubee.abstractfactoryandproxy.application;

import br.com.gubee.abstractfactoryandproxy.enums.UserFactoryEnum;
import br.com.gubee.abstractfactoryandproxy.factory.UserFactory;
import br.com.gubee.abstractfactoryandproxy.model.User;

public class Application {
    public static void main(String[] args) {
        System.out.println("====== USING ENUM AND CHOOSING PROXY PATTERN ======");
        User user = UserFactory.getFactory(UserFactoryEnum.PROXY).create();
        user.persistsIntoDatabase();

        System.out.println("\n====== NO ENUM BUT DEFAULT USING PROXY PATTERN  ======");
        User user2 = UserFactory.getFactory().create();
        user2.persistsIntoDatabase();

        System.out.println("\n====== USING ENUM AND CHOOSING NON_PROXY ======");
        User user3 = UserFactory.getFactory(UserFactoryEnum.NON_PROXY).create();
        user3.persistsIntoDatabase();

        System.out.println("\n====== USING ENUM AND CHOOSING JAVA PROXY ======");
        User user4 = UserFactory.getFactory(UserFactoryEnum.JAVA_PROXY).create();
        user4.persistsIntoDatabase();
    }
}
