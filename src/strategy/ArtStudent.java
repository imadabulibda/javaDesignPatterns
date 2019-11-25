package strategy;

public class ArtStudent implements Student {
    @Override
    public double calcGrade(int mid, int lab, int fin) {
        return (mid * 0.40) + (lab * 0.10) + (fin * 0.50);

    }
}
