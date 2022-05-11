package problems.linkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // Test methods of the LinkedList class --------

        LinkedList myList = new LinkedList();
        myList.insertAtFront("O");
        myList.insertAtFront("L");
        myList.insertAtFront("L");
        myList.insertAtFront("E");
        myList.insertAtFront("H"); // the list is: H -> E -> L -> L -> O
        // it is backwards since we are inserting in front of the head every time

        // Test methods of the LinkedList class
        System.out.println(myList.isSorted()); // false
        myList = new LinkedList();
        myList.insertAtFront("Z");
        myList.insertAtFront("F");
        myList.insertAtFront("D");
        myList.insertAtFront("A");
        // Created a sorted list A -> D -> F -> Z

        System.out.println(myList.isSorted()); // true

        myList = new LinkedList();
        myList.insertAtFront("ciao");
        myList.insertAtFront("bye");
        myList.insertAtFront("hello");
        myList.insertAtFront("hi");
        // Created a list "hi" -> "hello" -> "bye" -> "ciao"

        System.out.println(myList.findLongestString()); // 1

    }
}
