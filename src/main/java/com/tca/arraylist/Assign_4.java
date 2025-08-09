package com.tca.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Assign_4 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Enter the city :");
            String city = br.readLine();

            if(al.contains(city)){
                System.out.println(city +" is already present");
            }else{
                al.add(city);
            }

            System.out.println("Do you want add more [Yes/No] :");
            String choice = br.readLine();

            if(choice.equalsIgnoreCase("Yes")){
                continue;
            }else{
                break;
            }

        }
        System.out.println(al);
    }
}
