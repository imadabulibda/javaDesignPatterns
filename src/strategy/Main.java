package strategy;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new Strategy(new ItStudent());
        System.out.printf("It Grade is :: %10.2f " ,strategy.computeGrade(99,70,91));
        System.out.println(" ");

        strategy.setaStudent(new ArtStudent());
        System.out.printf("Art Grade is :: %10.2f " ,strategy.computeGrade(99,70,91));
    }
}
