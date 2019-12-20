// import java.util.*;

// class Solution {
//     boolean uniqueCharacters(String str) {
//         char [] charArray = str.toCharArray();

//         Arrays.sort(charArray);

//         for(int i = 0; i < charArray.length - 1; i++) {
//             if (charArray[i] != charArray[i + 1] )
//             continue;
//             else
//             System.out.println("Nawwww");
//             return false;

//         }
//         System.out.println("Yeahhhhboiii"); 
//         return true;

//     }

// }

// class Main {

//     public static void main(String[] args) {

//         // Scanner scanner = new Scanner(System.in);
//         // String inputString = scanner.next();
//         // scanner.close();
//         String inputString = "Julian";
//         Solution result = new Solution();
//         result.uniqueCharacters(inputString);
//         System.out.println(result);
//     }
// }

// // // Java program to illustrate String With
// // // Unique Characters using data structure
// // // import java.util.*;

// // // class GfG {
// // //     final static MAX_CHAR max = 256; 

// // //     boolean uniqueCharacters(String str) 
// // //     { 
// // //         // If length is greater than 256, 
// // //         // some characters must have been repeated 
// // //         if (str.length() > MAX_CHAR) 
// // //             return false; 

// // //         boolean[] chars = new boolean[MAX_CHAR]; 
// // //         Arrays.fill(chars, false); 

// // //         for (int i = 0; i < str.length(); i++) { 
// // //             int index = (int)str.charAt(i); 

// // //             /* If the value is already true, string 
// // //                has duplicate characters, return false */
// // //             if (chars[index] == true) 
// // //                 return false; 

// // //             chars[index] = true; 
// // //         } 

// // //         /* No duplicates encountered, return true */
// // //         return true; 
// // //     }

// // //     // Driver code
// // //     public static void main(String args[]) {
// // //         GfG obj = new GfG();
// // //         String input = "GeeksforGeeks";

// // //         if (obj.uniqueCharacters(input))
// // //             System.out.println("The String " + input + " has all unique characters");
// // //         else
// // //             System.out.println("The String " + input + " has duplicate characters");
// // //     }
// // // }
