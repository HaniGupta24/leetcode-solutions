
# Number of Ways to Paint a 3×N Grid

## 📌 Problem Overview

You are given an integer `n` representing the number of rows in a **3×n grid**. Each cell can be painted using **one of three colors**, subject to the following constraints:

* No two **adjacent cells** (horizontally or vertically) can have the **same color**.

Your task is to calculate the **number of valid ways** to paint the grid.

Since the answer can be very large, return it **modulo 10⁹ + 7**.

---

## 💡 Key Insight

For each row, there are **two valid color patterns**:

### 🔹 Pattern Types

1. **ABA Pattern**

   * First and third cells have the same color (e.g., `Red-Blue-Red`).
2. **ABC Pattern**

   * All three cells have different colors (e.g., `Red-Blue-Green`).

These patterns fully describe all valid colorings of a row.

---

## 🧠 Dynamic Programming Approach

We use **DP** where:

* `dp[i][0]` → number of ways to paint up to row `i` ending with an **ABA** pattern
* `dp[i][1]` → number of ways to paint up to row `i` ending with an **ABC** pattern

### 🔁 Transitions

* From previous row:

  ```
  dp[i][0] = 2 × dp[i-1][0] + 2 × dp[i-1][1]
  dp[i][1] = 2 × dp[i-1][0] + 3 × dp[i-1][1]
  ```

### 🧩 Base Case

* For the first row:

  ```
  dp[0][0] = 6  // ABA patterns
  dp[0][1] = 6  // ABC patterns
  ```

---



## ⏱ Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` (can be optimized to `O(1)` using rolling variables)

---


