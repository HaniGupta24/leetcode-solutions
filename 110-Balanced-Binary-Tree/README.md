
## 🌳 Balanced Binary Tree (LeetCode 110)

### 📌 Problem Statement

Given a binary tree, determine if it is **height-balanced**.

A binary tree is height-balanced if:

> For every node, the height difference between its left and right subtrees is **at most 1**.

---

### 💡 Approach (DFS + Height Calculation)

* Use **Depth First Search (DFS)** to calculate the height of each subtree.
* At every node:

  * Compute height of left and right subtrees.
  * If `|leftHeight - rightHeight| > 1`, mark the tree as **unbalanced**.
* Return height as `max(left, right) + 1`.

A global boolean flag is used to track balance during recursion.

---

### 🧠 Algorithm

1. Start DFS from the root.
2. Recursively compute left and right subtree heights.
3. Check balance condition at each node.
4. Return final balance status.

---



---

### ⏱ Complexity Analysis

* **Time Complexity:** `O(n)`
  (Each node is visited once)
* **Space Complexity:** `O(h)`
  (`h` = height of the tree due to recursion stack)

---

### ✨ Key Takeaway

Checking balance while computing height in one traversal makes the solution efficient and elegant.

---
