package GiveBattleCase.ObjectExamples;

import java.util.Scanner;

public class Main {
    static Scanner forWarUnitScan=new Scanner(System.in);
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        UnitAction unitAction=Scenario.selectUnit(0).getUnit();
        unitAction.fight();
        Ork ork= (Ork) unitAction;
        ork.setArmor(50);
        ork.fight();





    }
}