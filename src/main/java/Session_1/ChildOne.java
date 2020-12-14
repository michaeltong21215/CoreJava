package Session_1;

public class ChildOne extends FatherOne {
    private ChildOne() {
        super("Hi");
        System.out.println("Inside child");
    }

    public static void main(String args[]) {
        new ChildOne();
    }
}
