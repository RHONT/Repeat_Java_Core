package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Example_03 {
    public static void main(String[] args) {
        Supplier<List<String>> supplierList= ArrayList::new;
        List<String> list=supplierList.get();
        System.out.println(list);
    }
}
