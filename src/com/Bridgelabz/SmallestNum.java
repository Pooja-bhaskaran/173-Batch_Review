package com.Bridgelabz;

public class SmallestNum {
    public static void main(String[] args) {
        int []arr = {5,7,3,9,1};
        int min = arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("smallest number in the array : " + min);


    }

}
