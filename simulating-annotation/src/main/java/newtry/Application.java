package newtry;

public class Application {
    public static void main(String[] args) {
       System.out.printf("\n[Sem o uso de ENUM, mas padronizadamente vindo um UserFactory:]\n");
       AbstractUserFactory abstractUserFactory = UserFactoryHandler.create();
       abstractUserFactory.createUser("FirstName", "FirstPassword");

       System.out.printf("\n[Utilizando ENUM e vindo um UserFactoryProxy:]\n");
       AbstractUserFactory abstractUserFactory2 = UserFactoryHandler.create(FactoryEnum.PROXY);
       abstractUserFactory2.createUser("SecondName", "SecondPassword");

       System.out.printf("\n[Utilizando ENUM e vindo um UserFactory comum:]\n");
       AbstractUserFactory abstractUserFactory3 = UserFactoryHandler.create(FactoryEnum.NON_PROXY);
       abstractUserFactory3.createUser("ThirdName", "ThirdPassword");

    }
}
