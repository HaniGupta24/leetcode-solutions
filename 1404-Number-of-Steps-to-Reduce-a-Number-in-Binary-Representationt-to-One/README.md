

# 🔢 Number of Steps to Reduce a Binary Number to One

## 📌 Problem Statement

Given a binary string `s` representing a positive integer, return the number of steps required to reduce it to **1**.

### Rules:

* If the current number is **even** → divide it by 2
* If the current number is **odd** → add 1

Repeat until the number becomes **1**.

---

## 🧠 Approach (Greedy + Simulation Without Conversion)

Instead of converting the binary string into a large integer (which may overflow), we simulate the operations **directly on the binary string** from right to left.

### Key Idea:

* Traverse from the **least significant bit (rightmost)** to the left.
* Maintain a `carry` to simulate the effect of adding 1.
* For every bit (except the first one):

  * If `(bit + carry) == 1` →

    * It is odd → needs **2 steps**:

      1. Add 1
      2. Divide by 2
    * Set `carry = 1`
  * Else →

    * It is even → needs **1 step** (just divide by 2)

At the end, if a carry remains, add it to the answer.

---



## ⏱ Time & Space Complexity

* **Time Complexity:** O(n)
  (Single pass over the binary string)

* **Space Complexity:** O(1)
  (Only variables used, no extra data structures)

---

## 🔎 Example

### Input:

```
s = "1101"
```

### Steps:

```
1101 → 1110 → 111 → 1000 → 100 → 10 → 1
```

### Output:

```
6
```

---

## 🚀 Why This Solution Is Efficient

* Avoids BigInteger conversion
* Handles very large binary inputs
* Uses simple carry logic
* Linear time complexity

---


