package com.tca.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDuplicate {

    public static void main(String[] args) {

        LinkedList<String> L = new LinkedList<>();

        L.add("Pune");
        L.add("Mumbai");
        L.add("Delhi");
        L.add("Pune");
        L.add("Chennai");
        L.add("Mumbai");

        LinkedList<String> L2 = new LinkedList<>();

        for(String data : L){
            if(L2.contains(data)){
                continue;
            }else{
                L2.add(data);
            }
        }
        System.out.println(L2);
    }
}
