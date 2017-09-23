import java.util.Scanner;
import java.util.Stack;

public class Main {

    class Node{
        Node next;
        char value;
        public Node(char value)
        {
            this.value = value;
            this.next = null;
        }

    }
    Node head;
    int size= 0;
    public Main(){
        head = null;
    }
    public void insert(char value)
    {
        size++;
        if ( head == null)
        {
            head = new Node(value);
        }
        Node oldHed= head;
        head = new Node(value);
        head.next = oldHed;

    }
    public char pop(){

        size--;
        char value = head.value;
        head = head.next;
        return value;
    }
    public char peek()
    {
        return head.value;
    }
    public boolean isEmpty()
    {
        return (size == 0);
    }
    public static boolean CheckParentesis(String str)
    {
        if (str.isEmpty())
            return true;

        Main main = new Main();
        for (int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                main.insert(current);
            }


            if (current == '}' || current == ')' || current == ']')
            {
                if (main.isEmpty())
                    return false;

                char last = main.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    main.pop();
                else
                    return false;
            }

        }

        return main.isEmpty();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(CheckParentesis(sc.nextLine())?"yes":"no") ;
    }
}
