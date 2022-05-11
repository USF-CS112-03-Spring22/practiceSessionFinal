package problems.linkedList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    /**
     * Inserts a new node with the given element before the head
     * @param elem
     */
    public void insertAtFront(String elem) {
        Node newNode = new Node(elem);
        newNode.setNext(head);
        head = newNode;
    }



    public boolean isSorted() {
        // Write a non-recursive method that checks if this linked list's elements are sorted
        // in increasing order
        // you may use compareTo method of class String to compare elements

        // note: you should not sort the list, just check if it is sorted or no

        // FILL IN CODE

        return true;
    }

    /** Find an index of the node that contains the longest string.
     * For instance, if the list is: "hi"->"hello" -> "bye" ->"ciao", then the longest string  is "hello"
     *  and it's index in the list is 1. So the function should return 1.
     *  */
    public int findLongestString() {
        int indexOfLongestString = -1;
        // FILL IN CODE

        return indexOfLongestString;
    }
}
