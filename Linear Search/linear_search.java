import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static int linearsearch(int []arr,int to_be_searched)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==to_be_searched){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,12,19,343,454,46,56};
        int to_be_searched = 4;
        int ans = linearsearch(arr,to_be_searched);
        System.out.println(ans);
       
    }
}
