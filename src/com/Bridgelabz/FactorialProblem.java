package com.Bridgelabz;

// factorial of 6 = 6*5*4*3*2*1 = 120
public class FactorialProblem {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;
        int num = 6;
        for (i=1;i<num;i++){
            fact = fact*i;

        }
        System.out.println("Factorial number of 6 is : " + fact);
    }
}
