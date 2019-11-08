import java.util.HashMap;
import java.util.*;
import com.sun.org.apache.bcel.internal.generic.NEW;
import java.util.Map.Entry;
import java.util.Set;

class Main {
    public static void main(String[] args) {

        Solution result = new Solution();
        System.out.println(result.compressString("mississippi"));
    }
}

class Solution {
    int uniqTally = 0;

    String compressString(String original) {
        int strlen = original.length();
        if (original.isEmpty()) {
            System.out.println("Error: The string is empty");
        }
        HashMap<Character, Integer> originalMap = new HashMap<>();
        original = original.trim().toLowerCase();
        char[] origArr = original.toCharArray();
        for (char c : origArr) {
            if (uniqTally * 2 > strlen) {
                return original;
            }
            if (originalMap.containsKey(c)) {
                originalMap.put(c, originalMap.get(c) + 1);
            } else {
                originalMap.put(c, 1);
                uniqTally += 1;
            }
        }
        StringBuilder compStr = new StringBuilder();
        Set<Entry<Character, Integer>> entires = originalMap.entrySet();
        for (Entry<Character, Integer> ent : entires) {
            String nextKey = ent.getKey().toString();
            int nextValue = ent.getValue();
            compStr.append(nextKey + nextValue);
        }
        return compStr.toString();
    }
}
