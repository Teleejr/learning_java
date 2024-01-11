package MyDataStructures;/* Queues
* Samir-->Raheem-->Shawntea-->Jalyn
*
* Arrays or LinkedLists for setting this up as a Queue?
*
* Arrays are not good for Queues. Ideally you want to build with LinkedLists
* This because Arrays require shifting of indexes once you remove an element
*/


public class MyQueue {

    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    Node first;
    Node last;
    int length;

    public MyQueue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public Node peek() {
        return this.first;
    }

    public void enqueue(String value) {
        Node enqueue = new Node(value);
        if(this.length == 0) {
            this.first = enqueue;
            this.last = enqueue;
        } else {
            this.last.next = enqueue;
            this.last = enqueue;
        }
        this.length++;
    }

    public void dequeue() {
        if(this.first == null) {
            return;
        }
        if(this.first == this.last) {
            this.last = null;
        }
        this.first = this.first.next;
        this.length--;
    }

    @Override
    public String toString() {
        return "MyDataStructures.MyQueue{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }
}
