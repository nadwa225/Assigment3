public class DLNode<Book> {
    Book data;
    //public DLNode head;
    DLNode<Book> next;
    DLNode<Book> prev;

    public DLNode(Book data){
        //this.head = null;
        this.next = null;
        this.data = data;
        this.prev = null;
    }




}
