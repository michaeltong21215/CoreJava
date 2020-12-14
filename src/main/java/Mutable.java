public class Mutable {
    public static void main(String[] args) {
        //string is immutable, which is never really "changed"
        //["apple", "APPLE"]
        String a = "apple";
        String b = a;
        String c = a.toUpperCase();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        /*Immutable vs final
          final int PI = 3.1418192;
          Immutable: can change reference, cannot change content
          final: can change content, cannot change reference
         */
        final StringBuffer buffer = new StringBuffer("buffer string");
        buffer.append(" added");
        System.out.println(buffer);

        // buffer = new StringBuffer("new buffer string"); cannot assign new reference to a final variable

        //Homework: come up with more examples
    }
}
