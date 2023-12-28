import java.util.*;
import java.lang.*;
import java.io.*;

// using XOR Method
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,98,45,98};
        int ans =0;
        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
