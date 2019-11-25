package Singleton;

public class SingletonApp {
    public static void main(String[] args) {
        Singleton aSingleton1 = Singleton.getInstance();
        aSingleton1.setData("Software Engineering 2" );
        System.out.println(aSingleton1.getData());

        Singleton aSingleton2 = Singleton.getInstance();
        aSingleton2.setData("Singleton Design Patterns");

        System.out.println(aSingleton2.getData());
    }
}
