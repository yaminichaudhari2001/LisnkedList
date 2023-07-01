package bridgelabz.linkedlist;
//Ability to delete 40 from the Linked
//List sequence of 56->30->40->70
//and show the size of LinkedList is 3
//- Write Junit Test Case as demonstrated in class
//- Search LinkedList to find node with key value 40
//- Delete the node
//- Implement size() and show the Linked List size is 3
//- Final Sequence: 56->30->70
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
        System.out.println();
        li.searchAndDelete(40);
        li.printl();
        System.out.println();
        li.size();


    }
}
