package abstractfactoryandproxy;

import annotation.Transaction;

public class UserFactoryProxy implements AbstractUserFactory {

    private AbstractUserFactory abstractUserFactory;

    public UserFactoryProxy() {
        this.abstractUserFactory = new UserFactory();
    }

    private void validateAnnotation(Runnable runnable) {
        try {
            if(abstractUserFactory.getClass().getMethod("createUser", String.class, String.class).isAnnotationPresent(Transaction.class)) {
                System.out.printf("Iniciando execução do método $%s.%s\n", "UserFactory", "createUser");
                runnable.run();
                System.out.printf("Finalizando execução do método $%s.%s com $sucesso\n", "UserFactory", "createUser");
            }
        } catch(Exception e) {
            System.out.printf("Finalizando execução do método $%s.%s com $erro\n", "UserFactory", "createUser");
        }
    }

    @Override
    public UserImplementation createUser(String name, String password){
        this.validateAnnotation(() -> new UserImplementation().create(name, password));
        return null;
    }
}
