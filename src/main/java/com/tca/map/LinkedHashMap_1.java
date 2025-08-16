package com.tca.map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap_1 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(101,"AAA");
        lhm.put(102,"BBB");
        lhm.put(103,"CCC");
        lhm.put(104,"DDD");

        // Simple way: for-each loop
        for (Map.Entry<Integer, String> e : lhm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }


        System.out.println("------------------");

        char ch[] = {'A','B','C'};

        String str = new String(ch);

        System.out.println(str);



    }
}
