package AbstractFactory;

public class PhdTitle implements Title {
    @Override
    public void view(String tData) {
        System.out.println(("Phd course title: "+tData).toUpperCase());

    }
}
