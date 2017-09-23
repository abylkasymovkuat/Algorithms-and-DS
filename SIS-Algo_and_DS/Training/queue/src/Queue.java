// Java program for linked-list implementation of queue

import java.util.Scanner;

// A linked list (LL) node to store a queue entry


// A class to represent a queue
//The queue, front stores the front node of LL and rear stores ths
//last node of LL
public class Queue
{
    class Node
    {
        int key;
        Node next;

        // constructor to create a new linked list node
        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
    int cnt;
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
        cnt =0;
    }

    // Method to add an key to the queue.
    void enqueue(int key)
    {
        cnt++;
        // Create a new LL node
        Node temp = new Node(key);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null)
        {

            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;

        //System.out.print(temp.key);
      }

    // Method to remove an key from queue.
    int dequeue()
    {
        cnt--;
        // If queue is empty, return NULL.
        if (this.front == null)
        {};

        // Store previous front and move front one node ahead
        Node temp = this.front;
        if (this.front.key == 20) System.out.print(this.front.next.key);
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;

        return temp.key;
    }
    int size(){
        return cnt;
    }
    int front()
    {
        return front.key;
    }
    void clear()
    {
      this.rear = null;
      this.front = null;
        counter = 0;
    }
    private static int counter;

    public static void main(String[] args) {
        Queue q = new Queue();
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

                case ("push"):
                    if (counter >= 100) {
                        continue;
                    }
                    q.enqueue(Integer.parseInt(sArr[1]));
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
                    System.out.print(q.front() + "\n");
                    break;
                case ("clear"):
                    q.clear();
                    // word +=("ok\n");
                    System.out.print("ok\n");
                    break;
                case ("pop"):
                    // word +=(stack.pop() + "\n");
                    System.out.print(q.dequeue() + "\n");
                    counter--;
                    break;

                default:


            }
        }
    }
}




// Driver class



// This code 