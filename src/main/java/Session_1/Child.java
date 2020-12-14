package Session_1;

class Father {
    protected Father() {
        System.out.println("Created a Father");
    }
}

public class Child extends Father {
    private Child() {
        System.out.println("Inside child");
    }
    public static void main(String args[]) {
        new Child();
    }
}
