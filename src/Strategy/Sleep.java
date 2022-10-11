package Strategy;

public class Sleep implements Action{
    @Override
    public void doSomthing() {
        System.out.println("Начало активности Sleep");
        System.out.println("I sleep");
    }
}
