package bridgelabz.linkedlist;
//Ability to insert
//30 between 56
//and 70
//- Final Sequence: 56->30->70
public class RunLinkedList {
    public static void main(String[] args) {
        System.out.println("This is LinkedLink");
        LinkedList li=new LinkedList();
        li.addlast(56);
        li.addlast(70);
        li.searchAndInsert(30,56);
        li.printl();

    }
}
