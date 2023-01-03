package newtry;

import annotation.Transaction;

public interface AbstractUserFactory {
    UserImplementation createUser(String name, String password);
}
