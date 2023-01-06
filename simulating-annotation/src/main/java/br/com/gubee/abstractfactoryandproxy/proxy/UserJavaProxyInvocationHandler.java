package br.com.gubee.abstractfactoryandproxy.proxy;

import br.com.gubee.abstractfactoryandproxy.annotation.Transaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserJavaProxyInvocationHandler implements InvocationHandler {

    private final Object target;

    public UserJavaProxyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = false;
        if(target.getClass().getMethod(method.getName()).isAnnotationPresent(Transaction.class)) {
            System.out.printf("Iniciando execução do método $%s.%s\n", target.getClass().getName(), method.getName());
            try {
                result = method.invoke(target);
                System.out.printf("Finalizando execução do método $%s.%s com $sucesso\n", target.getClass().getName(), method.getName());
            } catch(Exception e) {
                System.out.printf("Finalizando execução do método $%s.%s com erro\n", target.getClass().getName(), method.getName());
            }
        } else {

        }
        return result;
     }
}
