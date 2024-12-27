package SingletonPattern;

public class App {

    public App() {
    }

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getObject();
        System.out.println(obj.hashCode()); // A123

        SingletonClass obj2 = SingletonClass.getObject();
        System.out.println(obj2.hashCode()); // A123
    }
}
