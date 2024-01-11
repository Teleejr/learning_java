package MyDataStructures;/*Stacks:

Browser history:
Google
Udemy
Youtube

Can be built with: Arrays or LinkedLists
Both can work, but it depends on what your preferences are given how each of them work.
Arrays allow for cache locality
LL's are dynamic and allow for more memory
*/

public class MyStack {

    class Node{
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    Node top;
    Node bottom;
    int length;

    public MyStack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public Node peek() {
        return this.top;
    }

    public Node pop() {
        if(this.top == null) {
            return null;
        }

        if(this.top.equals(this.bottom)) {
            this.bottom = null;
        }

        this.top = this.top.next;
        this.length--;
        return this.top;
    }

    public void push(String value) {
        Node push = new Node(value);
        if(this.length == 0) {
            this.top = push;
            this.bottom = push;
        } else {
            Node placeHolder = this.top;
            this.top = push;
            this.top.next = placeHolder;
        }
        this.length++;
    }

    @Override
    public String toString() {
        return "MyDataStructures.MyStack{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", length=" + length +
                '}';
    }
}
