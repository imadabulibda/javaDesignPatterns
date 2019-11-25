package Decorator;

public class SeCource extends Course{
    public SeCource(Program aProgram) {
        super(aProgram);
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Software Engineering Course.");
    }

}
