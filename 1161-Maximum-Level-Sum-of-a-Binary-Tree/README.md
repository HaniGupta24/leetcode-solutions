

📌 Maximum Level Sum of a Binary Tree
🧠 Problem Overview

Given the root of a binary tree, find the level (1-indexed) that has the maximum sum of node values.

If multiple levels have the same maximum sum, return the smallest level number.

💡 Approach (Breadth-First Search)

We use Level Order Traversal (BFS) to calculate the sum of nodes at each level.

Steps:

Use a Queue to perform BFS.

For each level:

Compute the number of nodes (levelSize)

Sum all node values at that level

Track the maximum sum and the corresponding level

Return the level with the highest sum

