
import java.util.Arrays;

/**
 * Implement an Array-based List that stores Book instances
 * An empty constructor: Should create an empty AList. This implies having an array initialized to an
 * initial maxSize and setting size to 0
 *
 * void listAdd(Book p): Should add a new node with the given book to the AList and resize when
 * appropriate.
 */
public class AList <Book>{
    private Book[] aList; // array
    private  int size;
    private int maxSize; // initial max size
    /**
     * Constructor initializing empty list
     */
    public AList(){
        this.size = 0; // size set to 0
        this.maxSize = 15; // max of the  array is 15
        this.aList = (Book[]) new Object[maxSize]; // array with the length of the maxsize
    }

    /**
     * method to add a new node with a given book to the AList + resize
     */
    public void listAdd(Book p) {


        if(size >= maxSize) { // if the size is => than max
            maxSize *= 2; // if array full, create larger array
            aList = Arrays.copyOf(aList, maxSize);// resizes the array and copies to new array
        }
            aList[size++] = p; // increment size by 1,

        }



    /**
     * removes item at position pos from the AList, shuffling items and updating size
     * @param pos
     */
    public void listRemove(int pos){
        if(pos < 0 || pos>= size){ // checks if pos is negative or >= current size
            System.out.println("Not a valid position");
        }
        int i;
        for(i = pos; i < size - 1; i++){ // iterates through the elements of the array from pos
            aList[i] = aList[i +1]; // shifts each element one pos to the left
        }
        // what happens if its on last element
        size --; // decrease size after element at pos is removed
    }

    public String toString(){
      if(size == 0) {
          return "Empty list";
      }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < size; i++){
           // aList[i]
            str.append(aList[i].toString()).append("\n");
        }
        return str.toString();

    }

}
