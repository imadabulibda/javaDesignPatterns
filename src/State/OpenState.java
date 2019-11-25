package State;

public class OpenState implements State{
    public OpenState(Context aContext){
        aContext.setaState(this);
    }

    @Override
    public void doAction() {
        System.out.println("Processing Open State >>>>>");
    }

    @Override
    public String toString() {
        return "The current state is : OpenState{" + '}';
    }
}
