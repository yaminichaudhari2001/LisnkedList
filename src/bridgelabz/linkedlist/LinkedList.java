package bridgelabz.linkedlist;

public class LinkedList {
Node head;
    void addfirst(int number) {
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void printl() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.number + "--->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
