import java.util.Scanner;

public class MyMerge {


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        MyMerge myMerge = new MyMerge();

        int n = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[n];

        String [] ss = scanner.nextLine().split(" ");

        for ( int i = 0; i < ss.length; i++)
        {
            arr[i] = Integer.parseInt(ss[i]);
        }
        myMerge.mergeSort(arr);
        for ( int i =0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public void mergeSort ( int [] arr  )
    {
        if (arr.length<2) return;
        int n = arr.length;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for ( int i =0;i<mid;i++)
        {
            left[i] = arr[i];
        }
        for ( int i = mid;i<n;i++)
        {
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);

    }

    public void merge(int[] left, int[] right, int[] arr) {
        int leftL = left.length;
        int rightL = right.length;
        int i =0,j=0,k=0;
        while (i < leftL && j<rightL)
        {
            if ( left[i] <right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else  if ( left[i] >right[j])
            {
                arr[k] = right[j];
                j++;
            }
            k++;

        }
        while (i<leftL)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<rightL)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}