package solution;

import java.util.HashMap;
import java.util.Map;

public class ArrayManipulation {

    /**
     * Print all numbers in the given array that occur more than once.
     * Use a HashMap to make the method efficient.
     * Example: if the array is {4, 0, 3, 1, 9, 3, 1, 6, 9, 3}, then the method should print 3, 1, and 9 in any order.
     * Think of how to use the hash map for this question.
     * Program to an interface!
     * @param array
     */
    public static void printDuplicates(int[] array) {
        // FILL IN CODE
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i]))
                map.put(array[i], 0);
            int count  = map.get(array[i]);
            map.put(array[i], count + 1);
        }
        for (Integer key: map.keySet())
        {
            if (map.get(key) > 1)
                System.out.println(key);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 0, 3, 1, 9, 3, 1, 6, 9, 3};
        printDuplicates(array);
    }
}
