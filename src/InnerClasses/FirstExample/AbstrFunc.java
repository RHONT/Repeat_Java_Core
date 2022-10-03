package InnerClasses.FirstExample;




public abstract class AbstrFunc {
    public abstract Integer function(int a);

    public Integer calc(int a, int b){
        return function(a)+function(b);
    }
}
