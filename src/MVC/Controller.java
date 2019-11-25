package MVC;

public class Controller {
    private Model aModel;
    private View aView;

    public Controller(Model aModel, View aView) {
        this.aModel = aModel;
        this.aView = aView;
    }

    public void setaModel(Model aModel) {
        this.aModel = aModel;
    }

    public void setaView(View aView) {
        this.aView = aView;
    }

    public void update(){
        aView.show(aModel.getName(), aModel.getMajor(), aModel.getgpa());
    }
}
