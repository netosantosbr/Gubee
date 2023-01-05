package br.com.gubee.abstractfactoryandproxy.model;

import br.com.gubee.abstractfactoryandproxy.annotation.Transaction;

public class SimpleUser implements User {

    @Override
    @Transaction
    public boolean persistsIntoDatabase() {
        System.out.printf("SimpleUser (name: Albert and age: 32) persisted into database.\n");
        return true;
    }
}
