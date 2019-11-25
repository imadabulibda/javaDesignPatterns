package AbstractFactory;

public class DipTeacher implements Teacher {
    @Override
    public void view(String tData) {
        System.out.println(("Dip course teacher: " + tData));
    }
}
