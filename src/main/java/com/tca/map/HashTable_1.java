package com.tca.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable_1 {

    public static void main(String[] args) {

        Hashtable<Integer, String> hm = new Hashtable<>();

        hm.put(101,"AAA");
        hm.put(102,"BBB");
        hm.put(103,"CCC");


        System.out.println("**************** Using Enumeration *************");
        Enumeration e = hm.keys();

        while(e.hasMoreElements()){
            Integer key = (Integer) e.nextElement();
            String value = hm.get(key);

            System.out.println(key + "--------------" + value);
        }
        System.out.println("************ Using for each loop *****************");

        Set<Integer> S = hm.keySet();

        for(Integer key : S){
            String value = hm.get(key);
            System.out.println(key + "----------" + value);
        }



    }
}
