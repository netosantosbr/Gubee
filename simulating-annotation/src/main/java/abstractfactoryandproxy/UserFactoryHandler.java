package abstractfactoryandproxy;

public class UserFactoryHandler {
    public static AbstractUserFactory create() {
        return new UserFactoryProxy();
    }

    public static AbstractUserFactory create(FactoryEnum factoryEnum) {
        return factoryEnum.getFactoryEnum();
    }
}
