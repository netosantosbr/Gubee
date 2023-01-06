package br.com.gubee.abstractfactoryandproxy.model;

import br.com.gubee.abstractfactoryandproxy.annotation.Transaction;

public interface User {
    boolean persistsIntoDatabase();
}
