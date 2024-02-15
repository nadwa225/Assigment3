public class DLList<Book> {
    private DLNode<Book> head;
    //public DLNode next;
    //public DLNode prev;


    /**
     * an empty constructor
     */
    public DLList(){
        this.head = null;
        //this.next = next;
    }

    /**
     * add a new DLNode with the given book to the DLList and update the pointers appropriately
     * @param p
     */
    public void listAdd(Book p) {
        DLNode<Book> newNode = new DLNode(p);
        if (head == null) {
            head = newNode; // is the head is null, the new node is the head
        } else {
            DLNode<Book> current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
        public void listRemove(int pos) {
            if (head == null) {
                return;
            }
            DLNode<Book> current = head;
            int num = 0; // current index
            while (current != null) {
                if (num == pos) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.prev.next = current.prev;
                    }
                    return;
                }
                current = current.next;
                num++;
            }
        }
            public String toString() {
                StringBuilder str = new StringBuilder();
                DLNode<Book> current = head;
                while (current != null) {
                    str.append(current.data.toString()).append("\n");
                    current = current.next;

                }
                return str.toString();

            }

}
