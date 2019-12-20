
// class Main {
//     public static void main(String[] args) {

//         Solution result = new Solution();
//         System.out.println(result.defangIPaddr("255.100.50.0"));
//     }
// }

// class Solution {
//     public String defangIPaddr(String address) {
//         CharSequence brackets = "[.]";
//         char period = '.';
//         StringBuilder addressSB = new StringBuilder();
//         char[] charAdd = address.toCharArray();
//         for (char c : charAdd) {
//             if (c == period) {
//                 addressSB.append(brackets);
//             } else {
//                 addressSB.append(c);
//             }
//         }
//         return addressSB.toString();
//     }
// }

