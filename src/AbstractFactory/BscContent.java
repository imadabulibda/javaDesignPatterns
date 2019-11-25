package AbstractFactory;

public class BscContent implements Content {
    @Override
    public void view(String cData) {
        System.out.println("BscTeacher course content: "+cData);
    }
}
