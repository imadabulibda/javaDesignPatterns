package Singleton;

public class Singleton {
    private static Singleton aSingleton;
    private String data;

    private Singleton() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if(aSingleton == null)
            aSingleton = new Singleton();
        return aSingleton;
    }
}
