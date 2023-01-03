package abstractfactoryandproxy;

public enum FactoryEnum {
    PROXY(new UserFactoryProxy()), NON_PROXY(new UserFactory());

    AbstractUserFactory abstractUserFactory;

    FactoryEnum(AbstractUserFactory userFactory) {
        this.abstractUserFactory = userFactory;
    }

    AbstractUserFactory getFactoryEnum() {
        return this.abstractUserFactory;
    }
}
