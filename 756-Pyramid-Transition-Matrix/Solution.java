// class Solution {

//     Map<String, List<Character>> hmap = new HashMap<>();

//     public boolean pyramidTransition(String bottom, List<String> allowed) {

//         for (String str : allowed) {
//             String key = str.substring(0, 2);
//             char value = str.charAt(2);

//             hmap.putIfAbsent(key, new ArrayList<>());
//             hmap.get(key).add(value);
//         }

//         return helper(bottom, "", 0);
//     }

//     private boolean helper(String row, String next, int index) {

//         if (row.length() == 1) {
//             return true;
//         }

//         if (next.length() == row.length() - 1) {
//             return helper(next, "", 0);
//         }

//         String key = row.substring(index, index + 2);

//         if (!hmap.containsKey(key)) {
//             return false;
//         }

//         for (char ch : hmap.get(key)) {
//             if (helper(row, next + String.valueOf(ch), index + 1)) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }


class Solution {

    Map<String, List<Character>> hmap = new HashMap<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {

        for (String str : allowed) {
            String key = str.substring(0, 2);
            char value = str.charAt(2);

            hmap.putIfAbsent(key, new ArrayList<>());
            hmap.get(key).add(value);
        }

        return helper(bottom, "", 0);
    }

    private boolean helper(String row, String next, int index) {

        // Base case: reached the top
        if (row.length() == 1) {
            return true;
        }

        // One level completed, move up
        if (next.length() == row.length() - 1) {
            return helper(next, "", 0);
        }

        String key = row.substring(index, index + 2);

        if (!hmap.containsKey(key)) {
            return false;
        }

        for (char ch : hmap.get(key)) {
            if (helper(row, next + ch, index + 1)) {
                return true;
            }
        }

        return false;
    }
}
