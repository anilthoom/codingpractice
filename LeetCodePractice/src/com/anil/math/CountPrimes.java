package com.anil.math;

public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(3));
    }
    public int countPrimes(int n) {
        int counter = 0;
        for (int i = 2; i<n; i++){
            if(isPrime(i))
                counter++;
        }
        return counter;
    }
    public boolean isPrime(int num){
        for(int i=2; i<=num/2; i++)
        {
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
