package AbstractFactory;

public class PhdDegree implements Degree {
    @Override
    public Title getTitle() {
        return new PhdTitle();
    }

    @Override
    public Content getContent() {
        return new PhdContent();
    }

    @Override
    public Teacher getTeacher() {
        return new PhdTeacher();
    }
}
