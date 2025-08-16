package com.tca.coreJava;

public class StringMethod_1 {

    public static void main(String[] args) {

        String s1 = "Apple";
        String s2 = "Banana";
        String s3 = "Apple";

        /*
         compareTo() --> It compares this object with another object and returns an int

         0 --> Both objects are equal
        -1 --> first object is less than the second object
         1 --> first object is greater than the second object

         */

        System.out.println(s1.compareTo(s2)); // negative (Apple < Banana)
        System.out.println(s2.compareTo(s1)); // positive (Banana > Apple)
        System.out.println(s1.compareTo(s3)); // 0 (both are equal)

        // Behind the scenes, it compares character by character using Unicode values.

        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b)); // -1 (10 < 20)
        System.out.println(b.compareTo(a)); //  1 (20 > 10)
        System.out.println(a.compareTo(10)); // 0 (equal)

    }
}
