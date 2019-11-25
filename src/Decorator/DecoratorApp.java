package Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        Program aProgram = new DbCourse(
                new AlgoCourse(
                        new SeCource(
                                new Student("Emad")
                        )
                )
        );
        aProgram.view();
    }
}
