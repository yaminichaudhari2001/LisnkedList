package bridgelabz.linkedlist;
//Ability to search
//LinkedList to find Node
//with value 30
//- Write Junit Test Case as
//demonstrated in class
//- Loop through LinkedList to
//find node with key 30
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
        System.out.println();
        li.findNode(30);
        li.findNode(70);


    }
}
