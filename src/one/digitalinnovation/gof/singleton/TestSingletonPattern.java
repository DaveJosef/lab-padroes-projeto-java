package one.digitalinnovation.gof.singleton;

public class TestSingletonPattern {
    public static void main(String[] args) {
        // momento A
        SingletonLazy singletonLazy = SingletonLazy.getInstance();

        System.out.println(singletonLazy);

        // momento B
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);


        // momento A
        SingletonEager singletonEager = SingletonEager.getInstance();

        System.out.println(singletonEager);

        // momento B
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);


        // momento A
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(singletonLazyHolder);

        // momento B
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
    }
}
