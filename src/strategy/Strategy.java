package strategy;

public class Strategy {
    private Student aStudent;

    public Strategy(Student aStudent) {
        this.aStudent = aStudent;
    }

    public void setaStudent(Student aStudent) {
        this.aStudent = aStudent;
    }


    public double computeGrade(int mid, int lab, int fin) {
        return this.aStudent.calcGrade(mid, lab, fin);
    }
}
