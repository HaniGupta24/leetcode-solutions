// class Solution {
//     public int longestBalanced(String s) {
//         int n = s.length();
//         int maxlen = 0;
//         for (int i = 0; i < n; i++) {
//             int freq[] = new int[26];
//             for (int j = i; j < n; j++) {
//                 freq[s.charAt(j) - 'a']++;
//                 if ((j - i + 1) > maxlen && checkBalance(freq)) {
//                     maxlen = j - i + 1;

//                 }
//             }
//         }
//         return maxlen;
//     }

//     boolean checkBalance(int freq[]) {
//         int expect = 0;
//         for (int f : freq) {
//             if (f == 0)
//                 continue;
//             if (expect == 0)
//                 expect = f;
//             else if (f != expect)
//                 return false;
//         }
//         return true;
//     }
// }


class Solution {
    public int longestBalanced(String s) {
        char[] chrs = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chrs.length && i <= chrs.length - res; i++) {
            int[] counts = new int[26];
            int types = 0;
            boolean[] seens = new boolean[26];
            int[] freqs = new int[chrs.length + 1];
            for (int j = i; j < chrs.length; j++) {
                int idx = chrs[j] - 'a';
                if (!seens[idx]) {
                    seens[idx] = true;
                    types++;
                }
                int count = counts[idx]++;
                freqs[count]--;
                freqs[count + 1]++;
                if (freqs[count + 1] == types && j - i + 1 > res)
                    res = j - i + 1;
            }
        }
        return res;
    }
}

