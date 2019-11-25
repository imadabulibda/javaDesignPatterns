package AbstractFactory;

public class DipContent implements Content {
    @Override
    public void view(String cData) {
        System.out.println(("Dip course content: "+cData).toUpperCase());

    }
}
