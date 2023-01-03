package newtry;

import annotation.Transaction;

public class UserFactory implements AbstractUserFactory {
    @Override
    @Transaction
    public UserImplementation createUser(String name, String password){
        new UserImplementation().create(name, password);
        return null;
    }
}
