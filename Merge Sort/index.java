import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3,0,98,45,65,7,45,646,47,567,57,567,35,436,5,7};
        int s = 0;
        int e = arr.length-1;
        MeegeSort(arr,s,e);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MeegeSort(int[] arr,int start,int end)
    {
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;

        MeegeSort(arr,start,mid);
        MeegeSort(arr,mid+1,end);
        Merge(arr,start,end);
    }
    public static void Merge(int[]arr,int start,int end)
    {
        int mid = (start+end)/2;

        int left_len = mid-start+1;
        int right_len = end-mid;

        int []left = new int[left_len];
        int []right = new int[right_len];
        int k = start;
        for(int i=0;i<left_len;i++){
            left[i]=arr[k];
            k++;
        }
        for(int i=0;i<right_len;i++){
            right[i]=arr[k];
            k++;
        }
        int left_idx=0;
        int right_idx=0;
        int main_idx=start;
        while(left_idx<left_len && right_idx<right_len){
            if(left[left_idx]<right[right_idx]){
                arr[main_idx++]=left[left_idx++];
            }
            else{
                arr[main_idx++]=right[right_idx++];
            }
        }
        while(left_idx<left_len){
            arr[main_idx++]=left[left_idx++];
        }
        while(right_idx<right_len){
            arr[main_idx++]=right[right_idx++];
        }
    }
}
