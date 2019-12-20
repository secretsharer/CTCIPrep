// class Main {

//     public static void main(String[] args) {

//         Solution result = new Solution();
//         // System.out.println(result.checkTwoStrings("Pump", "Tamp"));
//         System.out.println(result.checkTwoStrings("wolf ", "fl ow"));
//     }
// }

// class Solution {
//     int total = 0;

//     boolean checkTwoStrings(String q, String p) {
//         HashMap<Character, Integer> stringMap = new HashMap<>();
//         char[] qArray = q.toLowerCase().trim().toCharArray();
//         char[] pArray = p.toLowerCase().trim().toCharArray();

//         for (char c : qArray) {
//             if (stringMap.containsKey(c)) {

//                 // If char is present in charCountMap,
//                 // incrementing it's count by 1
//                 stringMap.put(c, stringMap.get(c) + 1);
//                 total += 1;
//             } else {

//                 // If char is not present in charCountMap,
//                 // putting this char to charCountMap with 1 as it's value
//                 stringMap.put(c, 1);
//                 total += 1;
//             }
//         }
//         for (char ch : pArray) {
//             if (stringMap.containsKey(ch)) {
//                 total -= 1;
//             }
//         }
//         System.out.println(stringMap);
//         System.out.println(total);

//         if (total != 0) {
//             return false;
//         }
//         return true;
//     }

// }


// import java.util.HashMap;

// class Main {
    
// public static void main(String[]  args) {
//     boolean result = checkTwoStrings("Pump", "Tamp");
//     System.out.println(result);
//     }
// }

// class Solution {
//     boolean checkTwoStrings(String q, String p) {
//         HashMap<Integer, String> stringMap = new HashMap<>();
//         char [] qArray = q.toCharArray();
//         char [] pArray = p.toCharArray();

//         stringMap = ArrayUtils.toMap(qArray);
//         System.out.println(stringMap);
//         return true;
//     }
// }