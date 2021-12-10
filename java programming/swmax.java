public class swmax {
    public static void main(String args[])
    {
        int[] arr= new int []{1,2,3,1,4,5,2,3,6,4};
        int k=3;
        int i=0,j=0,max=0,sum=0;
        while(j<arr.length)
        {
            sum=sum+arr[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                max= sum>max?sum:max;
                sum=sum-arr[i];
                i++;
                j++;
            }

        }
        System.out.println("max sum of size k "+max);
    }
    
}
