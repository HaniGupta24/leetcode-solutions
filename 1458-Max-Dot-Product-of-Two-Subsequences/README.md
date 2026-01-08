

Maximum Dot Product of Two Subsequences
📌 Problem Overview

Given two integer arrays nums1 and nums2, return the maximum dot product between non-empty subsequences of the two arrays.

A subsequence is formed by deleting some (or none) of the elements without changing the order of the remaining elements.

🧠 Approach

We use Dynamic Programming with Memoization (Top-Down DP).

At each index pair (i, j), we have three choices:

Skip nums1[i] → move to (i+1, j)

Skip nums2[j] → move to (i, j+1)

Take both elements
Add their product and continue with (i+1, j+1)

Since the subsequence must be non-empty, we return Integer.MIN_VALUE when we reach the end of either array.

Memoization ensures that each state (i, j) is computed only once.

