package com.tca.arraylist;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//Program to read ‘n’ cities names from user store them into ArrayList, the
//program should not allow duplicate city
public class Assign_3 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many cities : ");
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i<=n; ){
            System.out.println("Enter the city : ");
            String city = br.readLine();

            if(al.contains(city)){
                System.out.println(city + " is already present");
            }else {
                al.add(city);
                i++;
            }
        }

        System.out.println(al);

    }
}
