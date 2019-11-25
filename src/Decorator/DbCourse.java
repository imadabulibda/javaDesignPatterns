package Decorator;

public class DbCourse extends Course {

    public DbCourse(Program aProgram) {
        super(aProgram);
    }

    @Override
    public void view() {
        super.view(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Database Course.");
    }

}
