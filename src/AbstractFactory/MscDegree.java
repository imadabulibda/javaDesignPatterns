package AbstractFactory;

public class MscDegree implements Degree {
    @Override
    public Title getTitle() {
        return new MscTitle();

    }

    @Override
    public Content getContent() {
        return new MscContent();
    }

    @Override
    public Teacher getTeacher() {
        return  new MscTeacher();
    }
}
