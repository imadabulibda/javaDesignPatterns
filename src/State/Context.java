package State;

public class Context {
    private State aState;

    public Context() {
        this.aState = null;
    }

    public State getaState() {
        return aState;
    }

    public void setaState(State aState) {
        this.aState = aState;
    }
}
