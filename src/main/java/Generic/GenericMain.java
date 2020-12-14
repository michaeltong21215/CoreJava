package Generic;


import Session_1.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GenericMain {

    public void someMethod(){
        List<? extends Number> arr = new ArrayList<Number>();
        List<? extends Number> arrTwo = new ArrayList<Long>();
        List<? extends Number> arrThree = new ArrayList<Department>();
        List<? super Number> arrFour = new ArrayList<Number>();

    }

    public static void main(String[] args) {
        String str = "Hello World";

        List l1 = new ArrayList();
        l1.add(1);
        l1.add(new Float(3.2));
        l1.add("strOne");
        l1.forEach((val) -> {
            System.out.println("l1 val: " + val);
        });

        for(int i = 0; i < l1.size(); i++){
            Integer obj = (Integer)l1.get(i);
            System.out.println("l1 val again: " + obj.toString());
        }


        // basic generic use case for lists
        List<String> arr = new ArrayList<String>();
        arr.add("ele1");
        arr.add("ele2");

        arr.forEach((val) -> {
            System.out.println("val: " + val);
        });

        List<Integer> intArr = new ArrayList<Integer>();
        intArr.add(1);
        intArr.add(2);

        intArr.forEach((val) -> {
            System.out.println("int val: " + val);
        });

        List<Department> sArr = new ArrayList<Department>();
        Department d1 = new Department();
        d1.setDepartmentId("1");
        d1.setDepartmentName("d1");
        sArr.add(d1);
        sArr.forEach((val) -> {
            System.out.println("depart val: " + val);
        });
        // creating custom generic class
        GenericCLS<Integer> clsOne = new GenericCLS<>();
        clsOne.display(3);

        GenericCLS<String> clsTwo = new GenericCLS<>();
        clsTwo.display("happy coding!");
        // utilizing generic methods from a non-generic class
        GenericMethod mOne= new GenericMethod();
        System.out.println(mOne.funcOne(d1));

        // bounded generics example, list is upper-bound
        BoundedGenericList<List> b1 = new BoundedGenericList<>();
        List<String> boundArr = new ArrayList<String>();
        boundArr.add("bound1");
        boundArr.add("bound2");
        b1.printData(boundArr);

    }
}

/*
Generics
- introduced to avoid class cast exception from casting variables with unknown type
- Generic does not work for primitives
- Generic works for any parameter types
- can be applied to interface, class or method
- Generics works internally based on type eraser,
where generics type information is only available to the compiler.
It avoids the class cast exception.
- At compile time, it replaces the generic types with Objects.
- It replaces the bounded types with a first bound class

Wildcard
- an unknown types
-  <? extends Number>  means the instantiation of the variable
can have a child or grandchild type of number
- <? super Number> means the instantiation of the variable
can have a parent or grandparent type of number

Advice for interview:
- look for code in the api for generics

Next session
- Interview questions for Generics
- enum
- factory pattern

*/