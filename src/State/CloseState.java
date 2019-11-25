package State;

public class CloseState implements State {
    public CloseState(Context aContext) {
        aContext.setaState(this);
    }

    @Override
    public void doAction() {
        System.out.println("Processing Close State >>>>>");

    }

    @Override
    public String toString() {
        return "The current state is: CloseState{" + '}';
    }
}
