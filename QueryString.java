// // the inputs are the query string (e.g., 'ca?') and a list of words. The method should return the words in the list that meet the requirements of the query string.  A question mark can match any character. Assume all characters are letter.


// // e.g. 
// // query string: '?a?' 'h?v?'
// // list: 'cat', 'chad', 'bat', 'bot',
// // return: 'cat', 'bat' 

// // query string: 'ba?'
// // list: 'cat', 'chad', 'bat', 'bot',
// // return: bat' 

// // Made it more complex by adding '*' as a possible query string character. '*' can be zero to any number of characters

// // query string: 'ca*'
// // list: 'cat', 'chad', 'bat', 'bot', 'cable', 'ca'
// // return 'cat', 'cable', 'ca'

// // query string: 'ca*t'
// // list: 'cat', 'bat', 'cast','cannot', 'card'
// // return 'cat', 'cast','cannot'

// // We also talked about having '?' and '*' in the same string ('?a*')

// class Solution {
//     public static void main(String[] args) {
//         List<String> stringList = new List<>();
//         String query1 = "";
//         RegChecker rchecker = new RegChecker();
//         result = rchecker.findValidStrings(stringList, query1);
//         System.out.println(result);
//     }
// }

// class RegChecker {
//     String wildcard = "?";

//     List<String> findValidStrings(List<String> strings, String queryString) {
//         // convert string to char hash
//         // check for wildcard
//         // check for char
//         // note the key positions and if theyre at beginning or end
//         // assign those key positions as array/list positions 0, 1
//         // list ['cat', 'chad', 'bat', 'bot', 'cable', 'ca']
//     }
// }