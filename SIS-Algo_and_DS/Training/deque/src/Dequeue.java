import java.util.*;

public class Dequeue
{
    class Node
    {
        protected int data;
        protected Node link;

      
        public Node()
        {
            link = null;
            data = 0;
        }
        public Node(int d,Node n)
        {
            data = d;
            link = n;
        }
        public void setLink(Node n)
        {
            link = n;
        }
        public void setData(int d)
        {
            data = d;
        }
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

   
    public Dequeue()
    {
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return front == null;
    }
    public int getSize()
    {
        return size;
    }
    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
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
    public int peekAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }
    public int peekAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return rear.getData();
    }
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
