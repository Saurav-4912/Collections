package com.tca.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cities do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> al = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            String city = sc.nextLine();

            al.add(city);
        }

        System.out.println(al);
    }
}
