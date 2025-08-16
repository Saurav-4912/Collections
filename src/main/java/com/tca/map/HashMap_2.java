package com.tca.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;

public class HashMap_2 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"AAA");
        hm.put(102,"BBB");
        hm.put(103,"CCC");

        Set<Integer> S = hm.keySet();

        for(Integer key : S){
            String value = hm.get(key);
            System.out.println(key + "----------" + value);
        }
    }
}
