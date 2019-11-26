package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getLargestPrime(73);

    }
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int i = 2;
        while(number > 1){
            if(number % i == 0){
                number /= i;
            }else{
                i += 1;
            }
        }
        System.out.println(i);
        return i;
    }
}
