public class UtilityFile
{
    public static void swap(int[]arr, int i, int j)
    {
        int temp=arr[i];
        i=arr[j];
        j=temp;
    }

    public static void bubbleSort(int[]arr)
    {
        int thru=1;
        while(thru>0)
        {
            thru=0;
            for(int x = 0; x<arr.length; x++)
            {
                if(arr[x]>arr[x+1])
                {
                    swap(arr,x,x+1);
                    thru++;
                }
            }
        }
    }

    public static int[]arr()
    {
        int[] arr= new int[10000];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=i;
        }
        return arr;


    }
    
    public static int[]arr(int count)
    {
        int[]arr=new int[count];
        for(int x=0; x<arr.length; x++)
        {
            arr[x]=(int)(Math.random()*10001);
        }
        return arr;
    }
}
