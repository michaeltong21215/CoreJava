public class SubstringConcept {
    public static void main(String[] args) {
        String str = "Hello world!";
        str = str.substring(0,5);
        System.out.println(str); //Hello

        str = str.substring(0,4);
        System.out.println(str); //Hell

        String strTwo = "Hello world!";
        strTwo = strTwo.substring(4);
        System.out.println(strTwo); //o world!
        //startwith: case sensitive
        System.out.println(strTwo.startsWith("o"));
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("h"));
        System.out.println(str.startsWith("el", 1));
    }
}