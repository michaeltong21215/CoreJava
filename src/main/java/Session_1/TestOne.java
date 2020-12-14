package Session_1;

public class TestOne {
    static {
        System.out.println("from static block!");
    }
    static int k;

    public static void main(String[] args) {
        k = 10;
        System.out.println("k value is "+k);
    }
}
