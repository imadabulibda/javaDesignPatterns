package AbstractFactory;

public class BscTitle implements Title {
    @Override
    public void view(String tData) {
        System.out.println("BscTeacher course title: "+tData);

    }
}
