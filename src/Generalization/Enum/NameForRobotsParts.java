package Generalization.Enum;

public enum NameForRobotsParts {

    SMALLHEAD("Маленькая голова"),
    MEDIUMHEAD("Средняя голова"),
    BIGHEAD("Большая голова"),
    LIGHTARMOR("Легкая броня"),
    MEDIUMARMOR("Средняя броня");

    private String name;


    NameForRobotsParts(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
