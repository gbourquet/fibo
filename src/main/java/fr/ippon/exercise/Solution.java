package fr.ippon.exercise;

public class Solution {

    public static long fibonacci(long nbIteration) {

        if (nbIteration < 2){
            return nbIteration;
        }else {
            return fibonacci(nbIteration - 2) + fibonacci(nbIteration - 1);
        }
    }

    public static long evenFibonacci(long maxTerm) {
        return 0;
    }
}