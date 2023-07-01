package bridgelabz.linkedlist;
//Ability to delete the last
//element in the LinkedList
//of sequence 56->30->70 - Write popLast method
//- Note there is new tail
//- Final Sequence: 56->30
public class RunLinkedList {
    public static void main(String[] args) {
        System.out.println("This is LinkedLink");
        LinkedList li=new LinkedList();
        li.addlast(56);
        li.addlast(70);
        li.searchAndInsert(30,56);
        li.printl();
        System.out.println();
        li.lastdeletenode();
        li.printl();


    }
}
