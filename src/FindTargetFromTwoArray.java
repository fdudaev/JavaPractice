import java.util.Arrays;

public class FindTargetFromTwoArray {
    /**
     *
     * @param array1 - is the first parameter
     * @param array2 - is the second parameter
     * @param target - is an integer that we find out if a value from array1 and a value from array2 sum our target
     * @return - returning index from each array if they sum our target
     */
    public static int[] findTarget(int[] array1, int[] array2, int target) {

        // nested for loop, will go through the both arrays to find if index i + index j == target
        // i will start from array1[0] and loop through entire array2 on first loop
        for (int i = 0; i < array1.length; i++) {
            // if it doesn't find a target it i will take array1[1] and will go through entire array2
            // this will continue till we find a target or till i and j reach their length
            for (int j = 0; j < array2.length; j++) {
                // validating if i + j == target
                if (array1[i] + array2[j] == target) {
                    // if target is found, returning runtime new array with index i and index j (two that summed the target)
                    return new int[]{i, j};
                }
            }
        }
        // in case arrays are empty or target wasn't found will return null
        return null;
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 4, 3, 2, 2};
        int[] b = {3, 7, 4, 5, 7, 3, 4, 7, 88};
        int target = 14;
// calling the method
        System.out.println(Arrays.toString(findTarget(a, b, target)));
    }
}

