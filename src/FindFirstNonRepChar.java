public class FindFirstNonRepChar {
    public static Character findFirstNonRepChar (String str){

        for (char i : str.toLowerCase().toCharArray()){
            if (str.indexOf(i) == str.lastIndexOf(i)){
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepChar("Bilal"));
    }
}
