package Supplier;

import java.util.function.Supplier;

public class main
{
    public static void main(String[] args) {
        Supplier<R2D2> sup1=R2D2::new;

        R2D2 newRobot=sup1.get();
        newRobot.setName("Ivan");
        R2D2.printName(newRobot);





    }
}
