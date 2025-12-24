class Solution {
    public int maximumSum(int[] nums) {
        List<Integer> m0 = new ArrayList<>();
        List<Integer> m1 = new ArrayList<>();
        List<Integer> m2 = new ArrayList<>();

        for (int num : nums) {
            if (num % 3 == 0) m0.add(num);
            else if (num % 3 == 1) m1.add(num);
            else m2.add(num);
        }

        Collections.sort(m0, Collections.reverseOrder());
        Collections.sort(m1, Collections.reverseOrder());
        Collections.sort(m2, Collections.reverseOrder());

        int ans = 0;

        // 0 + 0 + 0
        if (m0.size() >= 3) {
            ans = Math.max(ans, m0.get(0) + m0.get(1) + m0.get(2));
        }

        // 1 + 1 + 1
        if (m1.size() >= 3) {
            ans = Math.max(ans, m1.get(0) + m1.get(1) + m1.get(2));
        }

        // 2 + 2 + 2
        if (m2.size() >= 3) {
            ans = Math.max(ans, m2.get(0) + m2.get(1) + m2.get(2));
        }

        // 0 + 1 + 2
        if (m0.size() >= 1 && m1.size() >= 1 && m2.size() >= 1) {
            ans = Math.max(ans, m0.get(0) + m1.get(0) + m2.get(0));
        }

        return ans;
    }
}
