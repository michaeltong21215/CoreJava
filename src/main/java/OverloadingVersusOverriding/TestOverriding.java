package OverloadingVersusOverriding;

import Session_1.Child;

public class TestOverriding {
    public static void main(String[] args) {
        Parent pChild = new ChildOverriding(4);
        System.out.println(pChild.getList());
    }
}

/*widening vs narrow casting
-widening: implicit casting
-narrow: explicit casting
 */