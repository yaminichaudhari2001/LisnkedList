package bridgelabz.linkedlist;
//Ability to delete the first
//element in the LinkedList
//of sequence 56->30->70 - Write pop method
//- Note there is new head
//- Final Sequence: 30->70
public class RunLinkedList {
    public static void main(String[] args) {
        System.out.println("This is LinkedLink");
        LinkedList li=new LinkedList();
        li.addlast(56);
        li.addlast(70);
        li.searchAndInsert(30,56);
        li.printl();
        li.firstdeletenode();
        li.printl();


    }
}
