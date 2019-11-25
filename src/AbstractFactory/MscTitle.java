package AbstractFactory;

public class MscTitle implements Title {
    @Override
    public void view(String tData) {
        System.out.println(("Msc course title: "+tData).toUpperCase());
    }
}
