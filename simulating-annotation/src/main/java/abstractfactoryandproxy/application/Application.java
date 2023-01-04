package abstractfactoryandproxy.application;

import abstractfactoryandproxy.enums.UserFactoryEnum;
import abstractfactoryandproxy.factory.UserFactory;
import abstractfactoryandproxy.model.User;

public class Application {
    public static void main(String[] args) {
        System.out.printf("\n======== EXECUTION USING PROXY WITHOUT ERROR ========\n");

        User user = UserFactory.create(UserFactoryEnum.PROXY).createUser("Mario", 22);
        user.persistsIntoDatabase();

        System.out.printf("\n======== EXECUTION USING PROXY WITH ERROR ========\n");

        User user2 = UserFactory.create(UserFactoryEnum.PROXY).createUser("Ma", 22);
        user2.persistsIntoDatabase();

        System.out.printf("\n======== EXECUTION NOT USING PROXY ========\n");

        User user3 = UserFactory.create(UserFactoryEnum.NON_PROXY).createUser("Mario", 22);
        user3.persistsIntoDatabase();
    }
}
