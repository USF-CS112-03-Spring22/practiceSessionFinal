package solution;

public class RecursionExamples {

    /**
     * Write a recursive method that checks whether a given string contains a given substring.
     * You may only use the following in-built methods of class String:
     * boolean startsWith(String s) and String substring(int index1, int index2).
     * @param string a given string
     * @param substring a given substring
     * @return true if the a string contains a given substring and false otherwise
     */
    public static boolean contains(String string, String substring) {
        if (string.length() == 0)
            return false;
        if (string.startsWith(substring))
            return true;
        else
            return contains(string.substring(1, string.length()), substring);

    }

    /**
     * A recursive method that checks if the given element is in the
     * subarray of the array arr, that starts with the given index
     * @param arr array
     * @param startIndex starting index where to start the search
     * @param elem the element to search for
     * @return
     */
    public static boolean find(int[] arr, int startIndex, int elem) {
        // FILL IN CODE

        return true; // edit
    }

    public static void main(String[] args) {
        // Test the contains method:
        String s = "Hello, world, hello!";
        System.out.println(contains(s, "world")); // true
        System.out.println(contains(s, "old")); // false

        int[] myArray = {6, 1, 4, 5, 2, 9};
        System.out.println(find(myArray, 0, 2)); // true
        System.out.println(find(myArray, 0, 11)); // false


    }
}
