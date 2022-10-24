package Function.HomeWork;

import java.util.function.Function;

/**
 * По разному создаю реализацию функционального интерфейса Function
 */
public class SimpleFunc {
    public static void main(String[] args) {
        SimpleFunc outerClass=new SimpleFunc();

        // Вытащил из внутреннго класса
        InnerClassFunction innerClass=outerClass.new InnerClassFunction();

        // через статический метод внешнего класса SimpleFunc
        Function<String,String> ouerClassStaticClass= new FuncFromStaticClass();

        // Интерфейс создан от внешнего класса через метод.
        Function<String,String> ouerClassMethod=outerClass::getFuncMethod;

        String apply = ouerClassStaticClass.apply("Год это по руссски, а по английски это: ");
        System.out.println(apply);

        String apply_2= ouerClassMethod.apply("O my ");
        System.out.println(apply_2);

        String apply_3= innerClass.apply("O my ");
        System.out.println(apply_3);
    }

    private String getFuncMethod(String s) {
        return s+"Func!";
    }

    static class FuncFromStaticClass implements Function<String,String>{
        @Override
        public String apply(String s) {
            return s+"Year";
        }
    }

    public class InnerClassFunction implements Function<String,String>{
        @Override
        public  String apply(String s) {
            return s+" God";
        }
    }

}
