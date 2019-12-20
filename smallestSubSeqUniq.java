class Main {
    public static void main(String[] args) {

        Solution result = new Solution();
        System.out.println(result.smallestSubsequence("ecbacba"));
    }
}

class Solution {
    public String smallestSubsequence(String text) {
        HashMap<String, Integer> charFreq = new HashMap<>();
        char[] textArr = text.toCharArray();
        for (char c : textArr) {
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c, 1);
            }
        }
        System.out.println(charFreq);
        return charFreq;
    }
}

// import org.apache.lucene.index.IndexSorter;

// class Solution {
// public String smallestSubsequence(String text) {
// Set<String> textSet = new HashSet<String>(Arrays.asList(text.split("",
// text.length())));

// IndexSorter indexer = new IndexSorter();

// String textResult = String.join("", textSet);
// return textResult;
// }

// }