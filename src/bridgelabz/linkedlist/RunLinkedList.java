package bridgelabz.linkedlist;
//Ability to insert 40 after 30 to
//the Linked List sequence of
//56->30->70
//- Write Junit Test Case as demonstrated
//in class
//- Search LinkedList to get Node with key
//value 30
//- Then Insert 40 to 30
//- Final Sequence: 56->30->40->70
public class RunLinkedList {
    public static void main(String[] args) {
        System.out.println("This is LinkedLink");
        LinkedList li=new LinkedList();
        li.addlast(56);
        li.addlast(70);
        li.searchAndInsert(30, 56);
        li.findNode(30);
        li.findNode(100);
        li.searchAndInsert(40, 30);
        li.printl();


    }
}
