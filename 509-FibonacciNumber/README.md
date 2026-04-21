
## 📌 Problem: Fibonacci Number

The **Fibonacci sequence** is defined as:

* `F(0) = 0`
* `F(1) = 1`
* `F(n) = F(n−1) + F(n−2)` for `n > 1`

Given an integer `n`, return the value of `F(n)`.

---

## 🧠 Approach (Iterative Solution)

Instead of using recursion (which is slower due to repeated calculations), this solution uses an **iterative approach** with two variables:

* Start with:

  * `a = 0`
  * `b = 1`
* Loop from `2` to `n`
* Update values:

  * `c = a + b`
  * shift values forward

This avoids extra memory and improves performance.

---

## 💻 Java Solution

```java
class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) return 0;
        else if (n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
```

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)` (constant extra space)

Efficient because it avoids recursion stack usage ✅

---

## 🎯 Key Learning

* Iterative DP optimization
* Space optimization technique
* Avoiding redundant recursive calls

---

If you're uploading multiple solutions daily for your **LeetCode 200-question streak**, I can generate a reusable README template so all your problem posts stay consistent and professional. 📂✨
