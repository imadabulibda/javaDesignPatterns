package AbstractFactory;

public class Course {
    private Title aTitle;
    private Content aContent;
    private Degree aDegree;
    private static Course aCourse;
    private Teacher aTeacher;

    private Course() {
    }

    public static Course getaCourse() {
        if (aCourse == null)
            aCourse = new Course();
        return aCourse;
    }

    public void setaDegree(Degree aDegree) {
        this.aDegree = aDegree;
    }

    public void view(String tData, String cData,String teacherData) {
        this.aTitle = this.aDegree.getTitle();
        this.aContent = this.aDegree.getContent();
        this.aTeacher = this.aDegree.getTeacher();
        System.out.println("Viewing Course Data ...");
        this.aTitle.view(tData);
        this.aContent.view(cData);
        this.aTeacher.view(teacherData);
    }
}
