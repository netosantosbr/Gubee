package abstractfactoryandproxy.proxy;

import abstractfactoryandproxy.model.ProxyUser;
import abstractfactoryandproxy.model.User;

import java.lang.reflect.Method;
import abstractfactoryandproxy.annotation.Transaction;

public class UserProxy implements User {
    private ProxyUser realService;

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

    public UserProxy(ProxyUser proxyUser) {
        this.realService = proxyUser;
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
