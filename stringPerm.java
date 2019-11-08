class Main {

    public static void main(String[] args) {

        Solution result = new Solution();
        // System.out.println(result.checkTwoStrings("Pump", "Tamp"));
        System.out.println(result.checkTwoStrings("wolf ", "fl ow"));
    }
}

class Solution {
    int total = 0;

    boolean checkTwoStrings(String q, String p) {
        HashMap<Character, Integer> stringMap = new HashMap<>();
        char[] qArray = q.toLowerCase().trim().toCharArray();
        char[] pArray = p.toLowerCase().trim().toCharArray();

        for (char c : qArray) {
            if (stringMap.containsKey(c)) {
                stringMap.put(c, stringMap.get(c) + 1);
                total += 1;
            } else {
                stringMap.put(c, 1);
                total += 1;
            }
        }
        for (char ch : pArray) {
            if (stringMap.containsKey(ch)) {
                total -= 1;
            }
        }
        System.out.println(stringMap);
        System.out.println(total);

        if (total != 0) {
            return false;
        }
        return true;
    }

}
