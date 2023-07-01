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
    void firstdeletenode() {
        if (head==null)
        {
            System.out.println("null");
        }
        int temp =head.number;
        head=head.next;
        System.out.println();
        System.out.println(temp+" is deleted");

    }
    void lastdeletenode() {
        if (head==null)
        {
            System.out.println("null");
        }
        Node temp =head;
        Node prev=head;
        while (temp.next != null) {
            prev=temp;
            temp = temp.next;
        }
        if(prev!=temp)
        {
            prev.next = null;
            return;
        }
        else {head=null;}
        System.out.println();
        System.out.println(temp.next.number+" is deleted");

    }

        public void findNode(int serach){
        Node temp = head;
        while(temp!=null){
            if(temp.number == serach){
                System.out.println("Element " + serach + " is present in linked list");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Element " + serach + " is not present in linked list");

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
