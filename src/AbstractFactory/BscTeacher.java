package AbstractFactory;

public class BscTeacher implements Teacher {
    @Override
    public void view(String tData) {
        System.out.println(("Bsc course teacher: " + tData));
    }
}
