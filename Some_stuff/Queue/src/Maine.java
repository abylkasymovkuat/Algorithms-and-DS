public class Maine {
    public static void main(String[] args) {
        MyQueue theQueue = new MyQueue(4);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);


        while (theQueue.isEmpty() != true) {
            int n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");  
        }
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);


        System.out.println("");
    }
}