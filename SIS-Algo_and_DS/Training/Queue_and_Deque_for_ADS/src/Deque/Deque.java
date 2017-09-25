package Deque;

public class Deque {

    class Node{
        int value;
        Node next;
        public Node ( int value){
            this.value = value;
            next = null;
        }
        public Node ( ){
            this.value = 0;
            next = null;
        }

    }
    Node front, rear;
    public Deque()
    {
        front = rear = null;
    }
    public void enqueue(int value)
    {
        Node temp = new Node(value);
        if (rear == null)
        {
            rear = front = temp;
            return;
        }

        rear.next = temp;
        rear = temp;
    }
    public void enqueueAtFront(int value)
    {
        Node temp = new Node(value);
        if (rear == null)
        {
            rear = front = temp;
            return;
        }
        temp.next = front;
        front = temp;
    }

    public int dequeue()
    {
        if( front == null){
            return -1;
        }
        int value = front.value;
        front = front.next;
        if (front == null)
        {
            rear = null;
        }
        return value;
    }

    public int dequeueAtRear()
    {
        if( rear == null){
            return -1;
        }
        int value = rear.value;
        Node s = front;
        Node t = front;
        while (s.next!= rear)
        {
            s = s.next;
        }
        rear = s;
        rear.next = null;
        if (rear == null)
        {
            front = null;
        }
        return value;
    }

    public static void main ( String args[])
    {
        Deque queue = new Deque();
        queue.enqueue(1612);
        queue.enqueue(110);
        queue.enqueueAtFront(40);
        queue.enqueueAtFront(30);
        queue.enqueueAtFront(20);
        System.out.println(queue.dequeueAtRear());
        System.out.println(queue.dequeueAtRear());
        System.out.println(queue.dequeueAtRear());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


    }
}
