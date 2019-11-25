package Decorator;

public class AlgoCourse extends Course {
    public AlgoCourse(Program aProgram) {
        super(aProgram);
    }
    @Override
    public void view() {
        super.view();
        System.out.println("Algorithms Design Course");
    }
}
