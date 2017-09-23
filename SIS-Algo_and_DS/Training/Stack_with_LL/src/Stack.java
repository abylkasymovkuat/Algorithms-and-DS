import java.util.Scanner;

public class Stack {

    private static int counter = 0;

    class Node {
        Node next;
        int value;
        public Node(int value)
        {
            this.value = value;
        }
    }
    Node head;
    public Stack()
    {
        head = null;
    }
    public void push(int value){
        if (head == null)
        {
            head = new Node(value);
        }
        else
        {
            Node oldHead = head;
            head = new Node(value);
            head.next = oldHead;
        }
    };
    public int back(){
        if ( head == null){}
        return head.value;
    }
    public void clear(){
        head = null;
        counter = 0;
    }
    public int pop() {
        if (head == null){}
        int value = head.value;
        head = head.next;
        return value;

    }
    public static void main(String args[]){
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        String  word = new String();
        word = "";
        counter = 0;
        String [] sArr;
        while (true){
            String sentence = scanner.nextLine();

            sArr = sentence.split(" ");
            if (sArr[0].equals("exit")) { System.out.println("bye"); break;}
            switch (sArr[0]){
                case ("push"):
                    if (counter >=100){continue;}
                    stack.push(Integer.parseInt(sArr[1]));
                    //word += "ok\n";
                    System.out.print("ok\n");
                    counter ++;
                    break;
                case("size"):
                    //word +=(counter +"\n");
                    System.out.print(counter +"\n");
                    break;

                case("back"):
                   // word +=(stack.back() +"\n");
                    System.out.print(stack.back() +"\n");
                    break;
                case("clear"):
                    stack.clear();
                   // word +=("ok\n");
                    System.out.print("ok\n");
                    break;
                case ("pop"):
                   // word +=(stack.pop() + "\n");
                    System.out.print(stack.pop() + "\n");
                    counter--;
                    break;

                default:


            }



        }

    }

}
 