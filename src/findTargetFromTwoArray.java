import java.util.Arrays;

public class findTargetFromTwoArray {

    public static int[] findTarget(int[] array1, int[] array2, int target) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] + array2[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 4, 3, 2, 2};
        int[] b = {3, 7, 4, 5, 7, 3, 4, 7, 88};
        int target = 14;

        System.out.println(Arrays.toString(findTarget(a, b, target)));
    }
}

