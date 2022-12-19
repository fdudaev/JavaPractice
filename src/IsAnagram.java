import java.util.Arrays;

public class IsAnagram {
    /**
     *
     * @param str1 is the first parameter
     * @param str2 is the second parameter
     * @return return true is both Strings have same length and exact same characters.
     */
    public static boolean isAnagram(String str1, String str2){

        // if the length are not the same we know strings are not Anagram and return false;
        if (str1.length() != str2.length()){
            return false;
        }
        char[] charArray1 = str1.toLowerCase().toCharArray(); //  converting str1 to lover cases and to char array
        char[] charArray2 = str1.toLowerCase().toCharArray(); //  converting str2 to lower cases and to char array

        Arrays.sort(charArray1); // sorting in alphabetical order
        Arrays.sort(charArray2); // sorting in alphabetical order

        return Arrays.equals(charArray1, charArray2);  // returning true is both sorted arrays are matching

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Islent"));
    }

}
