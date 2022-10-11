package Generalization.NewGeneration;

import Generalization.Base.HeadWork;
import Generalization.Enum.NameForRobotsParts;
import Generalization.Intarfase.HeadActions;

public class HeadChild extends HeadWork<HeadWork> {

    public HeadChild(NameForRobotsParts nameForRobotsParts, int armor, HeadActions headActions) {
        super(nameForRobotsParts, armor, headActions);
    }
    public void newFunc(){
        System.out.println("Рожденный в СССР");
    }
}
