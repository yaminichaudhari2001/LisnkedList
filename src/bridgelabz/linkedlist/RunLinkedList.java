package bridgelabz.linkedlist;
//Ability to create Linked
//List by appending 30 and
//70 to 56
//- Node with data 56 is First Created
//- Next Append 30 to 56
//- Finally Append 70 to 30
//- LinkedList Sequence: 56->30->70
public class RunLinkedList {
    public static void main(String[] args) {
        System.out.println("This is LinkedLink");
        LinkedList li=new LinkedList();
        li.addlast(56);
        li.addlast(30);
        li.addlast(70);
        li.printl();

    }
}
