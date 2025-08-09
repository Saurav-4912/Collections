package com.tca.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Pune");
        al.add("Mumbai");
        al.add("Delhi");
        al.add("Bangalore");

        System.out.println(al);

        al.remove("Delhi");

        System.out.println(al);

        // Calculate size of arraylist
        System.out.println("Size of arraylist : " + al.size());

        // Add multiple null value
        al.add(null);
        al.add(null);

        System.out.println(al);

        // to get value of index
        System.out.println(al.get(3));

        System.out.println("Traverse array list using for-each loop : ");
        // Traverse array list using for-each loop
        for(String data : al){
            System.out.println(data);
        }

        System.out.println("------------------------------------------------");

        // Traverse array list using Iterator
        System.out.println("Traverse array list using Iterator : ");
        Iterator<?> ir = al.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }


        // Remove all element from array list
        al.clear();
        System.out.println(al.size());
    }
}
