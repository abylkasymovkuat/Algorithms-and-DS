import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
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

        Arrays.sort(arr);
        Arrays.sort(arr1);
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

    }}