package Generalization.Base;

import Generalization.Intarfase.HeadActions;
import Generalization.Enum.NameForRobotsParts;

public class HeadWork<T extends HeadWork> {
    private HeadActions headActions;
    final String name;
    int armor;

    public HeadWork(NameForRobotsParts nameForRobotsParts, int armor, HeadActions headActions) {
        this.name = nameForRobotsParts.getName();
        this.armor = armor;
        this.headActions = headActions;
    }

    public HeadActions getHeadActions() {
        return headActions;
    }

    public String getName() {
        return name;
    }

}
