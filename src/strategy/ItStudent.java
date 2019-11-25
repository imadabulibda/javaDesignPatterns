package strategy;

public class ItStudent implements Student {
    @Override
    public double calcGrade(int mid, int lab, int fin){
        return (mid * 0.20) + (lab * 0.40) + (fin * 0.40);
    }
}
