import java.util.HashMap;
import java.util.*;

class PalindromPerm {
    int total = 0;

    boolean isPdromPerm(String s) {
        HashMap<Character, Integer> stringMap = new HashMap<>();
        s = s.trim().toLowerCase();
        char[] charArr = s.toCharArray();
        int strlen = charArr.length;
        for (char c : charArr) {
            if (stringMap.containsKey(c)) {
                stringMap.put(c, stringMap.get(c) - 1);
                total -= 1;
            } else {
                stringMap.put(c, 1);
                total += 1;
            }
            System.out.println(total);
        }
        if ((total *= -1) + 2 == strlen) {
            System.out.println("The word " + s + " is a permutation of a palindrome.");
            return true;
        }
        if (strlen % 2 != 0 && total != 1) {
            System.out.println("The word " + s + "is not a permutation of a palindrome.");
            return false;
        }
        if (strlen % 2 == 0 && total != 0) {
            System.out.println("The word " + s + " is not a permutation of a palindrome.");
            return false;
        }
        System.out.println("The word " + s + " is a permutation of a palindrome.");
        return true;
    }
}

class Main {

    public static void main(String[] args) {

        PalindromPerm result = new PalindromPerm();
        result.isPdromPerm("prawnwarp");
        // result.isPdromPerm("Chia");
        // result.isPdromPerm("wolfflow");
        // result.isPdromPerm("aaaacccc");
        // result.isPdromPerm("oooooooo");
        System.out.println(result);
    }
}
