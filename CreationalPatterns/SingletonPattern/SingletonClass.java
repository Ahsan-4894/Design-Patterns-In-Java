package SingletonPattern;

public class SingletonClass {
    // Eager way
    // private static SingletonClass instance = new SingletonClass();

    // Lazy way
    private static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getObject() {

        // Without thread safety
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;

        // With thread safety
        // if (instance == null) {
        // synchronized (SingletonClass.class) {
        // if (instance == null) {
        // instance = new SingletonClass();
        // }
        // }
        // }
        // return instance;
    }

}
