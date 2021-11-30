package com.anil.math;

public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(20));
    }
    //Optimal solution
    public int countPrimes(int n){
        boolean[] primeNum=new boolean[n];
        int result=0;

        for(int i=2;i<n;i++){
            if(primeNum[i]==false){
                result++;

                for(int time=2;i*time<n;time++){
                    primeNum[i*time]=true;
                }
            }
        }
        return result;
    }
    public int countPrimesBF(int n) {
        int counter = 0;
        for (int i = 2; i<n; i++){
            if(isPrime(i))
                counter++;
        }
        return counter;
    }
    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1) return false;
        if (n <= 3) return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
