package abstractfactoryandproxy;

public class UserImplementation implements User {
    private String login;
    private String password;

    @Override
    public User create(String login, String password) {
        System.out.println("Persisting user into database...");
        System.out.println("Persists Login: " + login + " | Password: " + password);
        return new UserImplementation();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
