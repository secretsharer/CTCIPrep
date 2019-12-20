class Main {

    public static void main(String[] args) {

        Solution result = new Solution();
        // result.checkTwoStrings("Pump", "Tamp");
        System.out.println(result.countCharFreq("Pump"));
    }
}

    class Solution {

        public int countCharFreq(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String str = "aasjjikkk";
        for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        Integer val = map.get(c);
        if (val != null) {
            map.put(c, new Integer(val + 1));
        }
        else {
        map.put(c, 1);
        }
      }
    } 
}   