package com.softgroup.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangle
{
    public static void main( String[] args ) {

        System.out.println("Enter natural number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        boolean loop = true;
        while (loop){
            try {
                n = Integer.parseInt(reader.readLine());
                loop = false;
            }catch (NumberFormatException e){
                System.out.println("Wrong entered data. Enter natural number");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i <= n ; i++) {
            System.out.print(getPascalTriangleElement(n, i)+" ");
        }


    }

    public static int getPascalTriangleElement (int n, int k){
        if (k == 0 || k == n) return 1;
        return getPascalTriangleElement(n-1, k-1) + getPascalTriangleElement(n-1, k);
    }
}
