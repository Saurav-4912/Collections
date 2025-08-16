package com.tca.coreJava;

public class StringMethods {
    public static void main(String[] args) {

        /*
         1) Primitive Data Types (int, char, float, boolean etc.)
            == compares values directly.
            No objects involved, so it’s just a value comparison.

        Example:
                int a = 10;
                int b = 10;
                System.out.println(a == b); // true (values are same)

           2) Wrapper Classes / Objects (Integer, String, Double, Boolean, etc.)
              == compares references (memory addresses), not the actual content.
              So, it checks whether both references point to the same object.

              Example with Integer:
              Integer x = new Integer(100);
              Integer y = new Integer(100);
              System.out.println(x == y);        // false (different objects in memory)
              System.out.println(x.equals(y));   // true (values are same)
         */

        String str1 = "BCA";
        String str2 = "BCS";

        // .equals methods check content of two object
        if(str1.equals(str2)){
            System.out.println("Both string are same!!");
        }else{
            System.out.println("Both are not same");
        }

        String a = new String("Hello");
        String b = new String("Hello");

        System.out.println(a==b);  // It's check object it means a and b both are referring same or not
        System.out.println(a.equals(b));  // It's check content of object
    }
}
