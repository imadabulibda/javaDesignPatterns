package MVC;

public class Model {
    private String name;
    private String major;
    private double gpa;

    public Model() {
    }

    public Model(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getgpa() {
        return gpa;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }

}
