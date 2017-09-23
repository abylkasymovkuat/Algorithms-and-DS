import java.util.Scanner;

public class BinarySearch {


    public static void main(String args[])
    {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = new int[scanner.nextInt()];

        int[] secArr = new int[scanner.nextInt()];
        for ( int i =0; i< firstArr.length; i ++)
        {
            firstArr[i] = scanner.nextInt();
        }
        for ( int i =0; i< secArr.length; i ++)
        {
            secArr[i] = scanner.nextInt();
        }
      //  System.out.print(firstArr.length+ " " + secArr.length);

        outerloop: for ( int i = 0 ; i < secArr.length; i ++){
            int l = 0, r = firstArr.length-1;
        while (true) {
            if ( l>r){System.out.println("NO"); break;}
            // choose middle element of segment
            int mid = (l + r) / 2;
            if (firstArr[mid] == secArr[i]) { // if we lucky then just print YES and finish program
                System.out.println("YES");
                continue outerloop;
            }
            if (firstArr[mid] < secArr[i]) {
                // this case means that all elements before mid are also smaller than X
                // so that means that we need to go with right part of our segment
                // [l, r] must become [mid + 1, r], thats only one assigning
                l = mid + 1;
            }
            else {
                // this case means that all elements after mid are also greater than X
                // so that means that we need to go with left part of our segment
                // [l, r] must become [l, mid - 1], thats only one assigning
                r = mid - 1;
            }

        }



        }
    }
}
