// import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Solution result = new Solution();
        result.oneAway("taco cat", "ccoat ti");
        // result.oneAway("bork", "pork");
        // result.oneAway("clip", "clomp");
        // result.oneAway("PILL", "lip ");
        // result.oneAway("Hammer time", "count ]");
        System.out.println(result);
    }
}

class Solution {

    int tally = 0;

    boolean oneAway(String s, String t) {
        if (s == t) {
            return true;
        }
        HashMap<Character, Integer> tMap = new HashMap<>();
        t = t.toLowerCase().trim();
        char[] tArray = t.toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        s = s.toLowerCase().trim();
        char[] sArray = s.toCharArray();

        for (char schar : sArray) {
            if (sMap.containsKey(schar)) {
                sMap.put(schar, sMap.get(schar) + 1);
            } else {
                sMap.put(schar, 1);
            }
        }

        for (char tchar : tArray) {
            System.out.println("Tally is " + tally);
            if (tally < -1) {
                System.out.println("Porky's is the worst movie maybe evar.");
                return false;
            }
            if (tMap.containsKey(tchar)) {
                tMap.put(tchar, tMap.get(tchar) + 1);
            } else {
                tMap.put(tchar, 1);
            }
            if (!sMap.containsKey(tchar)) {
                tally -= 1;
            }
        }

        System.out.println("Tally is " + tally);
        System.out.println("These two strings are less than 2 edits away from being the same.");
        return true;
    }
}
