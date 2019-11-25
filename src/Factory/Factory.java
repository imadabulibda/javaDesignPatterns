package Factory;

public class Factory {
    public static Student getStudent(String type){
        if(type.equalsIgnoreCase("IT"))
            return new ItStudent();
        else if (type.equalsIgnoreCase("ENG"))
            return new EngStudent();
        else if(type.equalsIgnoreCase("ART"))
            return new ArtStudent();
        else
            return new ItStudent();
    }
}
