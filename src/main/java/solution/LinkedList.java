package solution;

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

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.getElem());
            curr = curr.getNext();
        }
    }

    public boolean isSorted() {
        // Write a non-recursive method that checks if this linked list's elements are sorted
        // in increasing order
        // you may use compareTo method of class String to compare elements

        // note: you should not sort the list, just check if it is sorted or no
        Node curr = head;
        if (curr.getNext() == null)
            return true;
        while ((curr != null) && (curr.getNext() != null)) {
            if (curr.getElem().compareTo(curr.getNext().getElem()) > 0)
                return false;
            curr = curr.getNext();
        }
        return true;
    }

    public int findLongestString() {
        int indexOfLongestString = -1;
        // FILL IN CODE
        Node curr = head;
        int maxLength  = -1;
        int i = 0;
        while (curr != null) {
            String s = curr.getElem();
            if (s.length() > maxLength) {
                maxLength = s.length();
                indexOfLongestString = i;
            }
            curr = curr.getNext();
            i++;
        }

        return indexOfLongestString;
    }

}
