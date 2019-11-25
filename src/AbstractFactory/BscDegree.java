package AbstractFactory;

public class BscDegree implements Degree {
    @Override
    public Title getTitle() {
        return new BscTitle();

    }

    @Override
    public Content getContent() {
        return new BscContent();
    }

    @Override
    public Teacher getTeacher() {
        return new BscTeacher();
    }
}
