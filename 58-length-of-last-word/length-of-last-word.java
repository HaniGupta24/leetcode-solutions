    // class Solution {
    //     public int lengthOfLastWord(String s) {
    
    //         String[] words = s.trim().split("\\s+");

    //         String lastWord = words[words.length - 1];

    //     String str= String .valueOf(lastWord);
            
    // return str.length();
    //     }
    // // }
    // class Solution {
    // public int lengthOfLastWord(String s) {
    //     String[] words = s.trim().split("\\s+");
    //     return words[words.length - 1].length();
    // }
    // }
    class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            count++;
        }

        return count;
    }
}

