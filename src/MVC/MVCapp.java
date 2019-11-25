package MVC;

public class MVCapp {
    public static void main(String[] args) {
        Model model = new Model("Emad","SE",90);
        Controller controller = new Controller(model,new View1());
        controller.update();


        controller.setaView(new View2());
        controller.update();
    }
}
