import java.util.*;

public class Dequeue
{
    class Node
    {
        protected int data;
        protected Node link;

        /*  Constructor  */
        public Node()
        {
            link = null;
            data = 0;
        }
        /*  Constructor  */
        public Node(int d,Node n)
        {
            data = d;
            link = n;
        }
        /*  Function to set link to next Node  */
        public void setLink(Node n)
        {
            link = n;
        }
        /*  Function to set data to current Node  */
        public void setData(int d)
        {
            data = d;
        }
        /*  Function to get link to next node  */
        public Node getLink()
        {
            return link;
        }
        /*  Function to get data from current Node  */
        public int getData()
        {
            return data;
        }
    }

    private Node front, rear;
    private int size;

    /* Constructor */
    public Dequeue()
    {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }
    /* Clear dequeue */
    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to insert an element at begining  */
    public void insertAtFront(int val)
    {
        Node nptr = new Node(val, null);
        size++ ;
        if (front == null)
        {
            front = nptr;
            rear = front;
        }
        else
        {
            nptr.setLink(front);
            front = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtRear(int val)
    {
        Node nptr = new Node(val,null);
        size++ ;
        if (rear == null)
        {
            rear = nptr;
            front = rear;
        }
        else
        {
            rear.setLink(nptr);
            rear = nptr;
        }
    }
    /*  Function to remove front element from the queue */
    public int removeAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getLink();

        if (front == null)
            rear = null;
        size-- ;

        return ptr.getData();
    }
    /*  Function to remove rear element from the queue */
    public int removeAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        int ele = rear.getData();
        Node s = front;
        Node t = front;
        while (s != rear)
        {
            t = s;
            s = s.getLink();
        }
        rear = t;
        rear.setLink(null);
        size --;

        return ele;
    }
    /*  Function to check the front element of the queue */
    public int peekAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }
    /*  Function to check the front element of the queue */
    public int peekAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return rear.getData();
    }
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nDequeue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
    private static int counter;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class Dequeue */
        Dequeue dq = new Dequeue();
        Scanner scanner = new Scanner(System.in);
        String word = new String();
        word = "";
        counter = 0;
        String[] sArr;
        while (true) {
            String sentence = scanner.nextLine();

            sArr = sentence.split(" ");
            if (sArr[0].equals("exit")) {
                System.out.println("bye");
                break;
            }
            switch (sArr[0]) {

                case ("push_front"):
                    if (counter >= 100) {
                        continue;
                    }
                    dq.insertAtFront(Integer.parseInt(sArr[1]));
                    //word += "ok\n";
                    System.out.print("ok\n");
                    counter++;
                    break;
                case ("push_back"):
                    if (counter >= 100) {
                        continue;
                    }
                    dq.insertAtRear(Integer.parseInt(sArr[1]));
                    //word += "ok\n";
                    System.out.print("ok\n");
                    counter++;
                    break;
                case ("size"):
                    //word +=(counter +"\n");
                    System.out.print(counter + "\n");
                    break;

                case ("front"):
                    // word +=(stack.back() +"\n");
                    System.out.print(dq.peekAtFront() + "\n");
                    break;
                case ("pop_front"):
                    // word +=(stack.back() +"\n");
                    System.out.print(dq.removeAtFront() + "\n");
                    counter--;
                    break;
                case ("pop_back"):
                    // word +=(stack.back() +"\n");
                    System.out.print(dq.removeAtRear() + "\n");
                    counter--;
                    break;
                case ("back"):
                    // word +=(stack.back() +"\n");
                    System.out.print(dq.peekAtRear() + "\n");
                    break;
                case ("clear"):
                    dq.clear();
                    // word +=("ok\n");
                    System.out.print("ok\n");
                    counter = 0;
                    break;

                default:


            }

        }}
}