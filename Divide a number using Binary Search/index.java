import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
      int dividend = -21;
      int divisor = 7;
      int quotient = solve(dividend,divisor);
      System.out.println(quotient);
      
    }
    private static int solve(int dividend,int divisor)
    {
        int s = 0;
        int e = Math.abs(dividend);
        
        int ans = 0;
        while(s<=e){
            int mid = (s+e)/2;

            if(Math.abs(divisor*mid)==Math.abs(dividend)){
                ans=mid;
            }
            if(Math.abs(mid*divisor)>Math.abs(dividend)){
                e = mid-1;
            }
            else{
                ans = mid;
                s = mid+1;
            }
        }
        if((dividend<0 && divisor<0) || (dividend>0 && divisor>0)){
            return ans;
        }
        else{
            return -ans;
        }
       
    }
}
