package GiveBattleCase.ObjectExamples;

public class Ork extends Warior implements UnitAction{

    public Ork(int health, int armor) {
        super(health, armor);
    }

    @Override
    public void fight() {
        System.out.println("Орыч орет");
    }
}
