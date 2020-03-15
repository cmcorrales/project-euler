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
            int n = in.nextInt();
            int count = 0;
            for(int i = n - 1; i > 0; i--) {
                if (i % 3 == 0 || i % 5 == 0) {
                    count += i;
                }
            }
            System.out.println(count);
        }
    }
}