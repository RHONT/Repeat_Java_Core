package Strategy;



public class Hamster implements Action{
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public void doSomthing() {
        action.doSomthing();
    }
}
