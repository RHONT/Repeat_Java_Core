package GiveBattleCase.StringsExample;

import java.util.Objects;

public enum VariantInput {

    FIRST("1","Вы ввели цифру один"),
    SECOND("2","Вы ввели цифру два"),
    THIRD("3","Вы ввели цифру три"),
    FOURTH("4","Вы ввели цифру четыре");

    private String count;
    private String message;

    VariantInput(String count, String message) {
        this.count = count;
        this.message = message;
    }

    public static VariantInput getCountVariant(String fromConsole){
        for (VariantInput variantInput:VariantInput.values()) {
            if (Objects.equals(variantInput.count, fromConsole)) {
                CaseExample.foo();
                return variantInput;
            }
        }
        throw  new RuntimeException("Введено неправильное значение");
    }

    public String getMessage() {
        return message;
    }
}
