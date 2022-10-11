package Visitor;

/**
 * Отработка понимания шаблона Visitor
 * Мое понимание такое, что визитор изменяет объект и заточен на это
 * atacker - ломает постройку на 1
 * repair - чинит постройку на 1

 */
public class Main {
    public static void main(String[] args) {
        UnitAction atacker=new AtackerUnit();
        UnitAction repair=new RepairUnit();
        Buildings depo1=new Depo(50);
        Buildings chirje=new Chirje(20);

        depo1.actionOn(atacker);
        depo1.actionOn(atacker);
        System.out.println(depo1);

        chirje.actionOn(repair);
        System.out.println(chirje);


    }
}
