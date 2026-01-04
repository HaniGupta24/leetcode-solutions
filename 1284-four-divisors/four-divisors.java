class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int sum = 0;
            int count = 0;

            for (int div = 1; div * div <= num; div++) {
                if (num % div == 0) {
                    int other = num / div;

                    if (div == other) {
                        count++;
                        sum += div;
                    } else {
                        count += 2;
                        sum += div + other;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                ans += sum;
            }
        }

        return ans;
    }
}
