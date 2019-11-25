package AbstractFactory;

public class MscTeacher implements Teacher {
    @Override
    public void view(String tData) {
        System.out.println(("Msc course teacher: " + tData));
    }
}
