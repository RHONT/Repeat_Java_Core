package Generalization;

import Generalization.Base.BodyWork;
import Generalization.Base.HeadWork;
import Generalization.Enum.NameForRobotsParts;
import Generalization.Impl.SmallHeadImple;
import Generalization.NewGeneration.HeadChild;

public class Main {
    public static void main(String[] args) {
        HeadWork<HeadWork> h1=new HeadWork<HeadWork>(NameForRobotsParts.SMALLHEAD,10,new SmallHeadImple());
        BodyWork b1=new BodyWork(NameForRobotsParts.LIGHTARMOR,10);
        Robot<HeadWork<HeadWork>,BodyWork> r= new Robot<>(h1, b1);
        r.getHead().getHeadActions().action();
        System.out.println(r.getHead().getName());
        r.getHead().getHeadActions().test("Ура!!!");

        HeadChild headChild = new HeadChild(NameForRobotsParts.MEDIUMHEAD, 40, new SmallHeadImple());
        Robot<HeadChild, BodyWork> r2=new Robot<>(headChild,b1);
        r2.head.newFunc();
        r2.head.getHeadActions().attack();
        r2.head.getHeadActions().testArray(new int[]{1, 2, 3});
        int chislo=r2.head.getHeadActions().reformat("3");
        System.out.println(chislo);
        System.out.println(r2.head.getHeadActions().goInt("Строка"));


    }
}
