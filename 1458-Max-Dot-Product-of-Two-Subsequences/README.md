
# 🔢 Maximum Dot Product of Two Subsequences

## 📌 Problem Overview

You are given two integer arrays:

```id="i4n3oz"
nums1 and nums2
```

You need to find the **maximum dot product** of **non-empty subsequences** from both arrays.

---

## 📘 What is Dot Product?

For two subsequences:

```id="7l4yz6"
[a, b, c] and [x, y, z]
```

Dot product =

```id="f6bde6"
(a*x + b*y + c*z)
```

---

## ⚠️ Important Constraint

* Subsequence must be **non-empty**
* Order must be **preserved**

---

# 🧠 Approach

## Dynamic Programming (Top-Down + Memoization)

We define a function:

```id="0y51l2"
dp(i, j)
```

→ Maximum dot product using:

* `nums1[i...]`
* `nums2[j...]`

---

# 🔑 Choices at Each Step

At every `(i, j)` we have **3 options**:

---

### 1️⃣ Skip `nums1[i]`

```id="rqvr2c"
dp(i+1, j)
```

---

### 2️⃣ Skip `nums2[j]`

```id="0wz9gm"
dp(i, j+1)
```

---

### 3️⃣ Take both elements

```id="ywjh6z"
nums1[i] * nums2[j] + dp(i+1, j+1)
```

---

# ⚠️ Important Edge Case

Since subsequence must be **non-empty**, we handle base case carefully:

```id="fsc5ae"
if(i == n || j == m)
    return Integer.MIN_VALUE;
```

This ensures we don’t pick an empty subsequence.

---

# 💡 Key Trick

When taking elements:

```id="40hpfb"
nums1[i] * nums2[j] + max(0, dp(i+1, j+1))
```

Why?

* If future contribution is negative → ignore it
* Start fresh from current pair

---

# 🛠 Algorithm

1. Use recursion with memoization
2. At each `(i, j)` compute:

   * skip `nums1`
   * skip `nums2`
   * take both
3. Store results in DP table
4. Return maximum

# 📊 Example

### Input

```id="bklts6"
nums1 = [2,1,-2,5]
nums2 = [3,0,-6]
```

### Best subsequences:

```id="m1u9bn"
[2, -2] and [3, -6]
```

Dot product:

```id="2ylzow"
(2×3) + (-2×-6) = 6 + 12 = 18
```

---

# ⏱ Complexity

### Time Complexity

```id="a9cmlh"
O(n × m)
```

Each state `(i, j)` computed once.

---

### Space Complexity

```id="8uop7y"
O(n × m)
```

For DP table.

---

# 🔑 Key Insight

This problem is similar to **Longest Common Subsequence**, but instead of counting length, we:

* **maximize product sum**
* handle **negative values carefully**

---
