package abstractfactoryandproxy;

public interface User {
    public User create(String login, String password);
}
