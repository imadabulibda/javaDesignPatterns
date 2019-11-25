package Decorator;

public class Course implements Program {
    protected Program aProgram;

    public Course(Program aProgram) {
        this.aProgram = aProgram;
    }

    @Override
    public void view() {
        this.aProgram.view();
    }
}
