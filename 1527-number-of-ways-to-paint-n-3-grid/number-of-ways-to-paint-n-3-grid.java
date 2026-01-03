// class Solution {

//     long MOD = 1_000_000_007;
//     Long dp[][];

//     public int numOfWays(int n) {
//         dp = new Long[n][2];
//         long res = (6 * ways(1, n, 0) + 6 * ways(1, n, 1)) % MOD;
//         return (int) res;
//     }

//     long ways(int row, int n, int type) {
//         if (row == n) {
//             return 1;
//         }

//         if (dp[row][type] != null) {
//             return dp[row][type];
//         }

//         long ans;
//         if (type == 0) { // same-color pattern
//             ans = (2 * ways(row + 1, n, 0) % MOD
//                  + 2 * ways(row + 1, n, 1) % MOD) % MOD;
//         } else { // different-color pattern
//             ans = (2 * ways(row + 1, n, 0) % MOD
//                  + 3 * ways(row + 1, n, 1) % MOD) % MOD;
//         }

//         dp[row][type] = ans;
//         return ans;
//     }
// }
//Usind DYNAMIC PROGRAMMING
class Solution {

    long MOD = 1_000_000_007L;

    public int numOfWays(int n) {
        long[][] dp = new long[n][2];

        // Base case: first row
        dp[0][0] = 6; // ABA patterns
        dp[0][1] = 6; // ABC patterns

        for (int i = 1; i < n; i++) {
            dp[i][0] = (2 * dp[i - 1][0] + 2 * dp[i - 1][1]) % MOD;
            dp[i][1] = (2 * dp[i - 1][0] + 3 * dp[i - 1][1]) % MOD;
        }

        return (int) ((dp[n - 1][0] + dp[n - 1][1]) % MOD);
    }
}
