package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    private static class SingletonWrapper {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return SingletonWrapper.instance;
    }
}
