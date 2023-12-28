class solution{
  private int maximum(int []arr){
    int maxi=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>maxi){
        maxi=arr[i];
      }
    }
    return maxi;
  }
}
