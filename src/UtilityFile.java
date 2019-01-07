public class UtilityFile {

        public static void swap (int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void bubbleSort (int[] arr)
        {
            int thru = 1;
            while (thru > 0) {
                thru = 0;
                for (int x = 0; x < arr.length-1; x++)
                {
                    if (arr[x] > arr[x + 1])
                    {
                        swap(arr,x,x+1);
                        thru++;
                    }
                }
            }
        }


        public static int[] arr ( int count)
        {
            int[] arr = new int[count];
            for (int x = 0; x < arr.length; x++) {
                arr[x] = (int) (Math.random() * 10001);
            }
            return arr;
        }

        public static boolean sortCheck(int[]arr)
        {
            for(int x=0; x<arr.length-1;x++)
            {
                if(arr[x]>arr[x+1])
                {
                    return false;
                }
            }
            return true;
        }

        public static boolean checkSum(int[]before, int[]after)
        {
            int sum=0;
            for(int x=0; x<before.length; x++)
            {
                sum=sum+before[x];
            }
            int other=0;
            for(int y=-0; y<after.length; y++)
            {
                other=other+after[y];
            }
            if(sum==other)
            {
                return true;
            }
            return false;
        }


    }

