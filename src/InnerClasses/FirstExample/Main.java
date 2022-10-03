package InnerClasses.FirstExample;

/**
 * Один класс благодоря вложенным классам, может реализовывать по разному одни и те же методы
 * Так же можно на лету из класса вызывать необходимый
 */
public class Main {
    public static void main(String[] args) {
        MathClass mth=new MathClass();
        System.out.println(calculate(mth.getOne(), 5,5));
        System.out.println(calculate(mth.getTwo(), 5,5));

    }
    static Integer calculate(AbstrFunc abstrFunc,int a, int b){
        return abstrFunc.calc(a,b);
    }
}
