package Generalization.Base;

import Generalization.Enum.NameForRobotsParts;

public class BodyWork {
    final String name;
    int armor;

    public BodyWork(NameForRobotsParts nameForRobotsParts, int armor) {
        this.name = nameForRobotsParts.getName();
        this.armor = armor;
    }
}
