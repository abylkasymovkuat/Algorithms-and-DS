import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    private int[] array;
    private int[] tempMergArr;
    private int length;
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
         doMergeSort(lowerIndex, middle);
         
        doMergeSort(middle + 1, higherIndex);
         
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    public static void main(String args[]) {
        MergeSort mergeSort = new MergeSort();
        //int[] arr = { 10, 9, 8 , 7 , 6, 5 , 3, 2, 1};
        int[] arr, arr1;
        Scanner sc = new Scanner(System.in);
        arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr1 = new int[sc.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        mergeSort.sort(arr);
        mergeSort.sort(arr1);

        int i = 0;
        int j = 0;
        while (
                i < arr.length &&
                        j < arr1.length
                ) {
            //System.out.print(arr1[j]);

            if (arr[i] != arr1[j]) {
                System.out.print("NO");
                System.exit(0);
            }
            if (i == arr.length - 1) {
            } else {
                out1:
                while (arr[i] == arr[i + 1]) {
                    i = i + 1;
                    if (i == arr.length - 1) {

                        break out1;
                    }
                }
            }
            if (j == arr1.length - 1) {
            } else {
                out:
                while (arr1[j] == arr1[j + 1]) {
                    j = j + 1;
                    if (j == arr1.length - 1) {

                        break out;
                    }
                }
            }
            i++;
            j++;
        }

        if (i==arr.length && j ==arr1.length){
            System.out.print("YES");
        }else System.out.print("NO");

    }




}
