package Visitor;

public abstract class Buildings {
    private int durability;


    public Buildings(int durability) {
        this.durability = durability;
    }

    public void actionOn(UnitAction unitAction){
        unitAction.someDoIt(this);
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Buildings{" +
                "durability=" + durability +
                '}';
    }

}
