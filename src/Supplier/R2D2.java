package Supplier;


public class R2D2 {
    private String name;

    public R2D2() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void printName(R2D2 r2D2){
        System.out.println(r2D2.name);
    }

    @Override
    public String toString() {
        return "R2D2{" +
                "name='" + name + '\'' +
                '}';
    }
}
