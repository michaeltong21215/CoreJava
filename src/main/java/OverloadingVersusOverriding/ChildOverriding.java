package OverloadingVersusOverriding;
import java.util.ArrayList;

public class ChildOverriding extends Parent {
    public ChildOverriding(int val) {
        super(val);
    }

    public int increVal(){
        return this.val + 3;
    }

    @Override
    public ArrayList getList(){
       ArrayList arrList = new ArrayList<String>();
       arrList.add(12);
       return arrList;
    }
}
