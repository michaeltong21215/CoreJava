package OverloadingVersusOverriding;

import java.util.List;
import java.util.ArrayList;

public class Parent {
    protected int val;

    public Parent(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int increVal(){
        return this.val + 2;
    }

    public List getList(){
        List arrList = new ArrayList<String>();
        arrList.add(3);
        return arrList;
    }
}
