package Visitor;

public class RepairUnit implements UnitAction{

    public RepairUnit() {
    }

    @Override
    public void someDoIt(Buildings buildings) {
        buildings.setDurability(buildings.getDurability()+1);
    }
}
