package AbstractFactory;

public class PhdTeacher implements Teacher {
    @Override
    public void view(String tData) {
        System.out.println(("Phd course teacher: " + tData));

    }
}
