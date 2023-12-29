class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
    //   sq.top1++;
        top1++;
       if(top1<50){
           arr[top1]=x;
       }
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        top2--;
       if(top2>=50){
           arr[top2]=x;
       }
       
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        
       if(top1>-1){
           int val=arr[top1];
           top1--;
           return val;
       }
       return -1;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2<100){
           int val=arr[top2];
           top2++;
           return val;
       }
       return -1;
    }
}
