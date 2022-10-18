package GiveBattleCase.ObjectExamples;

import java.util.Objects;

public abstract class Warior {
    int health;
    int armor;

    public Warior(int health, int armor) {
        this.health = health;
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Warior{" +
                "health=" + health +
                ", armor=" + armor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warior)) return false;
        Warior warior = (Warior) o;
        return health == warior.health && armor == warior.armor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, armor);
    }
}
