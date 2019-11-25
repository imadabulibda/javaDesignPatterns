package AbstractFactory;

public class MscContent implements Content {
    @Override
    public void view(String cData) {
        System.out.println(("Msc course content: "+cData).toUpperCase());

    }
}
