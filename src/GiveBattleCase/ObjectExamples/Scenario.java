package GiveBattleCase.ObjectExamples;

public enum Scenario {
    ORK(0,new Ork(10,20)),ELF(1,new Elf(10,40));

    private final int countUnit;
    private UnitAction unit;

    Scenario(int countUnit, UnitAction warior) {
        this.countUnit = countUnit;
        this.unit = warior;
    }

    public static Scenario selectUnit(int selectUnit) {
        for (Scenario scenario: Scenario.values()) {
            if (scenario.countUnit==selectUnit) {
                scenario.unit.fight();
                return scenario;
            }
        }
        throw new RuntimeException("Такого воина нет");
    }

    public UnitAction getUnit() {
        return unit;
    }
}
