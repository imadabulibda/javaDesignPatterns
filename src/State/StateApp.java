package State;

public class StateApp {
    public static void main(String[] args) {
        Context aContext = new Context();
        State openState = new OpenState(aContext);
        openState.doAction();

        System.out.println(aContext.getaState());

        State closeState = new CloseState(aContext);
        closeState.doAction();

        System.out.println(aContext.getaState());
        System.exit(0);
    }
}
