package AbstractFactory;

public class DipDegree implements Degree {
    @Override
    public Title getTitle() {
        return new DipTitle();
    }

    @Override
    public Content getContent() {
        return new DipContent();
    }

    @Override
    public Teacher getTeacher() {
        return new DipTeacher();
    }

}
