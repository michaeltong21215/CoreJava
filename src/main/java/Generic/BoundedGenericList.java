package Generic;

import java.util.List;

public class BoundedGenericList<T extends List> {
    public void printData(List l1){
        l1.forEach((val) -> {
            System.out.println("val is: " + val);
        });
    }
}
