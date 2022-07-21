package com.Bridgelabz;

public class SwappingProblem {
    static int temp;
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        System.out.println("Before Swapping : " + i + " " + j );
        temp = i;
        i = j;
        j = temp ;
        System.out.println("After swapping : " + i + " " + j );
    }
}
