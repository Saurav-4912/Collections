package com.tca.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Assign_1 {
    public static void main(String[] args) {
        LinkedList<String> ob = new LinkedList<>();

        ob.add("Pune");
        ob.add("Mumbai");
        ob.add("Delhi");
        ob.add("Goa");

        System.out.println("LinkedList : " +ob);

        ArrayList<String> al = new ArrayList<>();

        al.add("GUJARAT");
        al.add("BANGALORE");

        System.out.println("ArrayList : " +al);

        int status = ob.indexOf("Mumbai");

        ob.addAll(status+1 , al);
        System.out.println(ob);


    }
}
