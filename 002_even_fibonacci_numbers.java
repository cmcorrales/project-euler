import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            int prevNum = 1;
            int nextNum = 2;
            int evenSum = 0;
            while (nextNum <= n) {
                if (nextNum % 2 == 0) {
                    evenSum += nextNum;
                }
                int temp = nextNum;
                nextNum = prevNum + nextNum;
                prevNum = temp;
            }
            System.out.println(evenSum);
        }
    }
}