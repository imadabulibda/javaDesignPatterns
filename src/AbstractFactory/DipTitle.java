package AbstractFactory;

public class DipTitle implements Title {
    @Override
    public void view(String tData) {
        System.out.println(("Dip course title: "+tData).toUpperCase());

    }
}
