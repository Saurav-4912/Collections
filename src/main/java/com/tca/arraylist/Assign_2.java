package com.tca.arraylist;

import java.util.ArrayList;

public class Assign_2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Initial Size of array list : " + al.size());

        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(55);

        System.out.println(al);
        System.out.println("Size of ArrayList after addition is : " + al.size());

        int sum = 0;
        for(Integer data : al){
            sum = sum + data;
        }

        System.out.println("Sum of the elements is : " + sum);
    }
}
