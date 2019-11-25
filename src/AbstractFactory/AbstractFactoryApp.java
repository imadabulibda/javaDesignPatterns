package AbstractFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        Course aCourse1 = Course.getaCourse();
        aCourse1.setaDegree(new BscDegree());
        aCourse1.view("SW Engineering 2", "Introduces design patterns ...","Dr.Abdelkareem Alashqar");

        Course aCourse2 = Course.getaCourse();
        aCourse2.setaDegree(new MscDegree());
        aCourse2.view("SW Engineering 2", "Introduces design patterns ...","Dr.Bassem alegla");


        Course aCourse3 = Course.getaCourse();
        aCourse3.setaDegree(new DipDegree());
        aCourse3.view("SW Engineering 2", "Introduces design patterns ...","Dr. Ehab Mortaja");

        Course aCourse4 = Course.getaCourse();
        aCourse4.setaDegree(new DipDegree());
        aCourse4.view("SW Engineering 2", "Introduces design patterns ...","Dr. Tawfiq Barhoom");
    }
}
