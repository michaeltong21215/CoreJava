package OverloadingVersusOverriding;

public class Overloading {
    public static int a(int val){
        return val;
    }

    public static int a(int val, int secondVal){
        return val + secondVal;
    }

    public static void main(String[] args) {
        int val = 1;
        int secondVal = 2;
        System.out.println(a(1));
        System.out.println(a(val, secondVal));
    }
}
