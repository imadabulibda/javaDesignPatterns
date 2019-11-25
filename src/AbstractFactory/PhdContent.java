package AbstractFactory;

public class PhdContent implements Content {
    @Override
    public void view(String cData) {
        System.out.println(("Phd course content: "+cData).toUpperCase());
    }
}
