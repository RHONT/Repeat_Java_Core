package InnerClasses.FirstExample;

public class MathClass {
    private class One extends AbstrFunc{
        @Override
        public Integer function(int a) {
            return a*a;
        }
    }

    private class Two extends AbstrFunc{
        @Override
        public Integer function(int a) {
            return a+a;
        }
    }

    public One getOne(){
        return new One();
    }

    public Two getTwo(){
        return new Two();
    }
}
