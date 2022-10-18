package GiveBattleCase.ObjectExamples;

public class Elf extends Warior implements UnitAction{

    public Elf(int health, int armor) {
        super(health, armor);
    }

    @Override
    public void fight() {
        System.out.println("Эльф орет");
    }
}
