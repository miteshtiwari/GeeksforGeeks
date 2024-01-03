import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }

        for(int currentcol=0;currentcol<arr[0].length;currentcol++){
            if(currentcol%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][currentcol]+" ");
                }
            }
            else{
                for(int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[j][currentcol]+" ");
                }
            }
        }
    }
}
