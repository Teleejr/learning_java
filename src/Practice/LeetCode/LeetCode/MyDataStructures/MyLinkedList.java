package MyDataStructures;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* This class is to work on creating my own LinkedList                        *
* so I can better understand its operations. I will create                   *
* the following methods for it:                                              *
* -append(): add a node to the end of the list                               *
* -prepend(): add a node to the beginning of the list                        *
* -insert(node, value): insert a node at a specified point in the list       *
* -remove(node): delete a node from a specified point in the list            *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class MyLinkedList {

    /*
    * Create 2 members of MyDataStructures.MyLinkedList, head and tail*/
    Node head;
    Node tail;

    int length;

    /*
    * Create Node class with 2 members: data, and next
    * data stores our values and next will be the next node*/
    class Node {
        public int data;
        public Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

        public Node() {}

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    /*
    * Next we have to create two objects of this Node class
    * to connect the next of the first node with the second*/
    public MyLinkedList() {

    }

    public MyLinkedList(int value) {
        head = new Node(value);
        tail = head;
        System.out.println("New MyDataStructures.MyLinkedList initiated: " + "head: " + this.head + " tail: " + this.tail);

//        head.next = tail;
//        tail.next = null;
        length++;
    }

    public void append(int value) {
        Node add = new Node(value);
        this.tail.next = add;
        this.tail = add;
        length++;
    }

    @Override
    public String toString() {
        return "MyDataStructures.MyLinkedList{" +
                "head=" + head +
                ", tail=" + head.next +
                '}' + "\n" + "Length: " + length;
    }
}
