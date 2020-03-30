import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean checkPrime(int x) 
        { 
            if ( x == 1 ) {
                return false;
            }
            for (int i = 2; i < x; i++) 
                if (x % i == 0) 
                    return false; 
    
            return true; 
        } 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            int largestFactor = 0;
            for(int a1 = 1; a1 <= n; a1++) {
                if (n % a1 == 0 && checkPrime(a1)) {
                    largestFactor = a1;
                }
            }
            System.out.println(largestFactor);
        }
    }
}