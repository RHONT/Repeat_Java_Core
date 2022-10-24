package GiveBattleCase.StringsExample;

import java.util.Scanner;

public class CaseExample {

    static Scanner inputValueConsole = new Scanner(System.in);
    static String valueFromConsole;

    public static void main(String[] args) {

        valueFromConsole = inputValueConsole.nextLine();


        System.out.println(VariantInput.getCountVariant(valueFromConsole).getMessage());

//        switch (valueFromConsole) {
//            case "1":
//                System.out.println("Один!");
//                foo();
//                break;
//            case "2":
//                System.out.println("Два!");
//                foo();
//                break;
//            case "3":
//                System.out.println("Три!");
//                foo();
//                break;
//            case "4":
//                System.out.println("Четыре!");
//                foo();
//                break;
//            default:
//                System.out.println("Значение введено неправильно");
//        }
//        System.out.println(valueFromConsole);


    }

    public static void foo() {
        System.out.println(valueFromConsole.concat(" " + valueFromConsole + "!"));
    }


}
