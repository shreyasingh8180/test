/*public class dsaarr2 {
    static class Pair
    {
        int max;
        int min;
    }
    static void printArr(int arr[])
    {
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    static Pair ans(int arr[],int n)
    {
        Pair ob=new Pair();
        int i=0;
        if(n==1) 
        {
            ob.max=arr[0];
            ob.min=arr[0];
            return ob;
        } 
        if (arr[0]>arr[1]){
            ob.max=arr[0];
            ob.min=arr[1];
        }
        else{
            ob.max=arr[1];
            ob.min=arr[0];
        }
        
        for(i=2;i<n;i++)
        {
            ob.max=ob.max>arr[i]?ob.max:arr[i];
            ob.min=ob.min<arr[i]?ob.min:arr[i];
        }
        return ob;
    }
    public static void main(String[] ars)
    {

        int[] arr= new int[]{1000,11,445,1,330,3000};
        int n=arr.length;
        Pair obj= ans(arr,n);
        System.out.println("maximum ="+obj.max);
        System.out.println("manimum ="+obj.min);


    }
    
}**/

public class dsaarr2{
    static class Pair {
        int max;
        int min;
    }
    static Pair ans(int arr[],int high,int low)
    {
        Pair ob= new Pair();
        Pair mml= new Pair();
        Pair mmr= new Pair();
        int mid;
        if (high == low)
        {
            ob.max=arr[high];
            ob.min=arr[low];
            return ob;
        }
        if(low+1==high)
        {
            ob.max=arr[low]>arr[high]?arr[low]:arr[high];
            ob.min=arr[low]<arr[high]?arr[low]:arr[high];
            return ob;
        }
        mid=(low + high)/2;
        mml=ans(arr,low,mid);
        mmr=ans(arr,mid+1,high);
        ob.max=mml.max>mmr.max?mml.max:mmr.max;
        ob.min=mml.min<mmr.min?mml.min:mmr.min;
        return ob;
    }
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int size = 6;
        Pair ob = ans(arr, 0, size - 1);
        System.out.printf("\nMinimum element is %d", ob.min);
        System.out.printf("\nMaximum element is %d", ob.max);
    }
}
