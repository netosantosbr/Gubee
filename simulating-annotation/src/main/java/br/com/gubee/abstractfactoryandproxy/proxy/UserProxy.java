package br.com.gubee.abstractfactoryandproxy.proxy;

import br.com.gubee.abstractfactoryandproxy.annotation.Transaction;
import br.com.gubee.abstractfactoryandproxy.model.User;

import java.lang.reflect.Method;

public class UserProxy implements User {
    private User realService;

    private void validateAnnotation(Method method, Runnable runnable) {
        try {
            if(method.isAnnotationPresent(Transaction.class)) {
                System.out.printf("Iniciando execução do método $%s.%s\n", realService.getClass().getName(), method.getName());
                runnable.run();
                System.out.printf("Finalizando execução do método $%s.%s com $sucesso\n", realService.getClass().getName(), method.getName());
            }
        } catch(Exception exception) {
            System.out.printf("Finalizando execução do método $%s.%s com $erro\n", realService.getClass().getName(), method.getName());
        }

    }

    public UserProxy(User user) {
        this.realService = user;
    }

    @Override
    public boolean persistsIntoDatabase() {
        try {
            validateAnnotation(this.realService.getClass().getMethod("persistsIntoDatabase"),
                    () -> this.realService.persistsIntoDatabase());
            return true;
        } catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
            return false;
        }

    }
}
