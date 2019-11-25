package Factory;

public class FactoryApp {
    public static void main(String[] args) {
        Student aStudent = Factory.getStudent("it");
        aStudent.showData();

        aStudent = Factory.getStudent("eng");
        aStudent.showData();
    }
}
