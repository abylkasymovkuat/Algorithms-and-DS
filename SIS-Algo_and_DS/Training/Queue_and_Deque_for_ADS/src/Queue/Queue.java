package Queue;

public class Queue {

    class Node{
        int value;
        Node next;
        public Node ( int value){
            this.value = value;
            next = null;
        }

    }
    Node front, rear;
    public Queue()
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
    public int dequeue()
    {
        if ( front == null){
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
    public static void main ( String args[])
    {
        Queue queue = new Queue();
        queue.enqueue(1612);
        queue.enqueue(110);
        queue.enqueue(40);
        queue.enqueue(30);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
