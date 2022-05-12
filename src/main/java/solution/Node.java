package solution;

/** A node in the singly linked list. Contains a String element and a reference
 * to the next node.
 */
public class Node {
    private String elem;
    private Node next;

    public Node(Node head) {
        this.elem = head.elem;
        this.next = head.getNext();
    }

    public Node(String elem) {
        this.elem = elem;
        next = null;
    }

    public Node (String elem, Node next) {
        this.elem = elem;
        this.next = next;
    }


    public Node getNext() {
        return next;
    }

    public String getElem() {
        return elem;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }
}

