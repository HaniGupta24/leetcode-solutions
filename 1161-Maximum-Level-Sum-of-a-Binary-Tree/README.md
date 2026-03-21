

# Maximum Level Sum of a Binary Tree

## 📌 Problem Description

Given the **root of a binary tree**, determine the **level (1-indexed)** that has the **maximum sum of node values**.

If multiple levels have the **same maximum sum**, return the **smallest level number**.

---

# 🌳 Example

Binary Tree:

```
        1
       / \
      7   0
     / \
    7  -8
```

Level sums:

| Level | Nodes | Sum |
| ----- | ----- | --- |
| 1     | 1     | 1   |
| 2     | 7, 0  | 7   |
| 3     | 7, -8 | -1  |

Maximum sum = **7** at **Level 2**

**Output**

```
2
```

---

# 💡 Approach

## Breadth-First Search (Level Order Traversal)

We traverse the tree **level by level** using **BFS**.

Data structure used:

* **Queue**

---

# 🛠 Algorithm Steps

### 1️⃣ Initialize

* Queue for BFS
* Variables:

  * `maxSum`
  * `maxLevel`
  * `currentLevel`

---

### 2️⃣ Start BFS

Add the **root node** to the queue.

---

### 3️⃣ Process Each Level

For each level:

1. Determine number of nodes

```
levelSize = queue.size()
```

2. Compute level sum

3. Process all nodes in that level

---

### 4️⃣ Update Maximum

If:

```
levelSum > maxSum
```

Update:

```
maxSum = levelSum
maxLevel = currentLevel
```

---

### 5️⃣ Move to Next Level

Increment level counter.

---


# ⏱ Complexity

### Time Complexity

```
O(n)
```

Each node is visited **once**.

### Space Complexity

```
O(n)
```

Queue may store up to **one level of nodes**.

---

# 🔑 Key Concept

We use **Breadth‑First Search (BFS)** because it naturally processes nodes **level by level**, making it ideal for problems involving **level-based calculations in trees**.

---

✅ **Interview Tip:**
Whenever the problem mentions **“level”, “depth”, or “layer of a tree”**, think about **Level Order Traversal (BFS)** first.

---




