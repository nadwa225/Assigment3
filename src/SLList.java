/**
 * An empty constructor: Should create an empty SLList. This implies having a member data element
 * Head of type SLNode initialized to NULL
 * void listAdd(Book p): Should add a new SLNode with the given book to the end of the SLList and
 * update the pointers appropriately
 * void listRemove(int pos): Should remove the item at position pos from the SLList. This implies
 * updating the pointers appropriately
 * String toString(): This method should return a string containing all the elements in the SLList. Each
 * element should be in a new line when the resulting String is printed.
 */
public class SLList<Book> {
    private SLNode head;


    public SLList(){
        this.head = null; // head type is null

    }

    /**
     * adds a new SLNode with given book
     *
     */
    public void listAdd(Book p){

        SLNode<Book> sl = new SLNode(p);
        if(head == null){
            head = sl; // is the head is null, the new node is the head
        } else{
            SLNode<Book> current = head;
            while(current.next != null){
                current = current.next;

            }
            current.next = sl;
        }
    }

        public void listRemove(int pos){
        // remove item from pos from sslist
        if(head == null || pos < 0){ // if the list is empty/ less than 0
            return;
        }

        //removing the head
        if(pos == 0){
            head = head.next;
            return;
        }

        SLNode<Book> current = head; // stores the head node to var
            int num = 0;
            while(current != null && num < pos - 1){
           current = current.next;// changes the head
            num++;
        }

        // the node before to be deleted
        //var != null &&
       // for(int i = 0; previous != null && i <pos - 1; i++){
           // previous = previous.next;
        //}

        // handling out of bound situations
        if(current == null || current.next == null){
           return;
        }

        current.next = current.next.next; //unlink node from list

        //previous.next = next;
    }
        public  String toString(){
            if (head == null) {
                return "Empty List";
            }
        StringBuilder str = new StringBuilder();
        SLNode<Book> current = head;
        while (current != null){
            str.append(current.data.toString()).append('\n');
        }
        return str.toString();

    }

}
