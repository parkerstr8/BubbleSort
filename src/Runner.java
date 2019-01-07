

public class Runner
{
    public static void main(String[]args)
    {
        int[] testArr = UtilityFile.arr(7);
        System.out.println("Before: ");
        for(int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
            UtilityFile.bubbleSort(testArr);
            System.out.print("After: ");
            for (int num : testArr)
            {
                System.out.print(num + " ");
                System.out.println();
                UtilityFile.sortCheck(testArr);
                UtilityFile.checkSum(testArr, )
            }
        }


}
