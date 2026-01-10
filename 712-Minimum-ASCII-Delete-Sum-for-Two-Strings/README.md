Minimum ASCII Delete Sum for Two Strings

This repository contains a Java solution for the problem “Minimum ASCII Delete Sum for Two Strings”, solved using Dynamic Programming with Memoization (Top-Down DP).

🧩 Problem Statement

Given two strings s1 and s2, you can delete characters from either string.
Each deletion costs the ASCII value of the deleted character.

👉 Your task is to return the minimum total ASCII sum of deleted characters so that the two strings become equal.

💡 Approach

This solution uses recursion + memoization:

We compare characters at indices i and j in both strings.

If characters match → move both pointers forward.

If characters don’t match → try deleting from:

s1 or

s2

Choose the option with the minimum ASCII cost.

A 2D DP array stores already computed states to avoid recomputation.

🧠 Algorithm

Define a recursive helper function helper(i, j)

Base case:

If one string is exhausted, delete remaining characters from the other

If characters match:

Move to (i+1, j+1)

If characters don’t match:

Try deleting from either string and take the minimum cost

Store results in DP table

🧪 Example
Input:
s1 = "sea"
s2 = "eat"

Output:
231

Explanation:
Delete 's' from s1 (ASCII 115)
Delete 't' from s2 (ASCII 116)
Total = 115 + 116 = 231
