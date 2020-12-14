package Immutability;

public class ImmutableVsFinal {
    public static void main(String[] args) {
        String strOne = "str";
        System.out.println("Before hashcode: " + strOne.hashCode());
        strOne = "changed_str";
        System.out.println("After hashcode: " + strOne.hashCode());

        final StringBuffer bufOne = new StringBuffer(strOne);
        System.out.println("buf before hashcode: " + bufOne.hashCode());
        bufOne.append(" now!");
        System.out.println("buf current str: " + bufOne.toString());
        bufOne.append(" again!");
        System.out.println("buf after hashcode: " + bufOne.hashCode());


    }
}
