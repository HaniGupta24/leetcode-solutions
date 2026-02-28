

# 🔁 Minimum Operations to Make Binary String All Ones

## 📌 Problem Statement

Given a binary string `s` of length `n` and an integer `k`, you can perform the following operation any number of times:

* Choose a substring of length `k`
* Flip all bits in that substring (0 → 1, 1 → 0)

Return the **minimum number of operations** required to make the string contain **no zeros**.
If it is impossible, return `-1`.

---

## 🧠 Key Observation

Instead of tracking the whole string every time, we track only:

> ✅ **Number of zeros in the string**

Let:

* `z` = current number of zeros
* After flipping a window of size `k`,

  * Suppose the window contains `x` zeros
  * Then new zero count becomes:

[
newZ = z + k - 2x
]

Because:

* `x` zeros → become ones
* `k - x` ones → become zeros

So:

* Zeros decrease by `x`
* Zeros increase by `k - x`

Net change = `k - 2x`

---

## 🚀 Approach Used (BFS on Zero Count)

This is a **shortest path problem** where:

* Each state = number of zeros (`0 → n`)
* Each edge = one flip operation
* Goal = reach `0` zeros
* Use **BFS** to ensure minimum operations

---

## ⚙️ Optimization Trick

Instead of checking all possible `x` values repeatedly:

* Maintain two `TreeSet`s:

  * `evenSet` → stores unused even zero counts
  * `oddSet` → stores unused odd zero counts

Why parity matters?

From formula:

[
newZ = z + k - 2x
]

Since `2x` is always even:

[
newZ % 2 = (z + k) % 2
]

So reachable zero counts must follow fixed parity.


---


## ⏱ Time Complexity

* Each zero count is visited once
* TreeSet operations take `O(log n)`

👉 **Overall: O(n log n)**

---

## 🧮 Space Complexity

* `O(n)` for:

  * BFS queue
  * TreeSets
  * Operations array

---



