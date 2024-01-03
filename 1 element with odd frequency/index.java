import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        int [] arr = {1,1,5,2,2,3,3,4,4,3,3,9,9,600,600,4,4};
        int ans = solve(arr);
        System.out.print(arr[ans]);
    }
    private static int solve(int []arr)
    {
        int s= 0 ;
        int e =arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(s==e){
                return s;
            }
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    s = mid+2;
                }
                else{
                    e=mid;
                }
            }
            else{
                if(arr[mid]==arr[mid-1]){
                    s = mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }
}
