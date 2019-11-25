package Decorator;

public class Student implements Program {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void view() {
        System.out.println("Student: "+this.name);

    }
}
