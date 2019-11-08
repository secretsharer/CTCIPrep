import java.util.*;

class Solution {
    boolean uniqueCharacters(String str) {
        char [] charArray = str.toCharArray();

        Arrays.sort(charArray);

        for(int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] != charArray[i + 1] )
            continue;
            else
            System.out.println("Nawwww");
            return false;

        }
        System.out.println("Yeahhhhboiii"); 
        return true;

    }

}

class Main {

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // String inputString = scanner.next();
        // scanner.close();
        String inputString = "Julian";
        Solution result = new Solution();
        result.uniqueCharacters(inputString);
        System.out.println(result);
    }
}
