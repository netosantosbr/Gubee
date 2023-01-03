package abstractfactoryandproxy;

public interface AbstractUserFactory {
    UserImplementation createUser(String name, String password);
}
