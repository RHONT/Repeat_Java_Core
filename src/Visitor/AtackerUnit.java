package Visitor;

public class AtackerUnit implements UnitAction {


    @Override
    public void someDoIt(Buildings buildings) {
        buildings.setDurability(buildings.getDurability()-1);
    }
}
