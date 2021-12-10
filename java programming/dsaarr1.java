public class dsaarr1 {
    static void reverseArr(int arr[],int start,int end)
    {
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void printArr(int arr[])
    {
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    
    public static void main(String[] args) 
    {
        int[] arr= new int[]{4,5,1,2};
        printArr(arr);
        reverseArr(arr,0,arr.length-1);
        printArr(arr);
        
    }   
} 
