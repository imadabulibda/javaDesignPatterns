package Facade;


public class FacadeApp {
    public static void main(String[] args) {
        StudentMaker studentMaker = StudentMaker.getaMaker();
        studentMaker.viewART();
        studentMaker.viewEdu();
        studentMaker.viewEng();
        studentMaker.viewIT();
    }
}
