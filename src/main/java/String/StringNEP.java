package String;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class StringNEP {
    public static boolean isHelloWord(String str) {
        if(!StringUtils.isEmpty(str)){
            return str.equals("Hello World");
        }
        return "Hello World".equals(str);
    }

    public static String getHelloWorldOne(Optional<String> str){
        if(str.isPresent()){
            return str.get();
        }
        return null;
    }

    public static void main(String[] args) {
        String strOne = "HasVal";
        Optional<String> str = Optional.ofNullable(strOne);
        strOne = getHelloWorldOne(str);
        // System.out.println(isHelloWord(str));
        System.out.println("strOne: " + strOne);
    }
}

/* Next session
- performance on set and map
- Generics
- Java 8 Cocnepts
 */