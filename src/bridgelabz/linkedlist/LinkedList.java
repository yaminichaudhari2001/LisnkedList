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
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public void searchAndInsert(int number, int search){
        Node temp= head;
        Node newNode = new Node(number);
        if(head == null){
            head = newNode;

        } else {
            while (temp.number != search && temp.next != null){
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }

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
