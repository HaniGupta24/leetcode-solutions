
# 🧮 Minimize Maximum Pair Sum in an Array

## 📌 Problem Statement

You are given an integer array `nums` of **even length**.

* Pair up elements such that **each element is used exactly once**
* Return the **minimum possible value of the maximum pair sum**

---

# 💡 Approach

## Greedy + Two Pointers

---

## 🧠 Key Idea

To **minimize the maximum pair sum**, we:

👉 Pair:

* **Smallest element** with **largest element**

This balances the sums and prevents large values from dominating.

---

# 🔍 Why This Works

If we pair:

* Large + Large → very big sum ❌
* Small + Small → leaves large numbers to pair later ❌

But:

* Small + Large → balanced pairs ✅

This **greedy strategy** ensures the maximum pair sum is minimized.

---

# 🛠 Algorithm

### 1️⃣ Sort the array

```id="m7y74m"
Arrays.sort(nums);
```

---

### 2️⃣ Initialize pointers

```id="s9lq2n"
i = 0
j = n - 1
```

---

### 3️⃣ Pair elements

While `i < j`:

```id="c9m6n3"
sum = nums[i] + nums[j]
maxSum = max(maxSum, sum)
i++
j--
```

---

### 4️⃣ Return result

```id="q1ps6y"
maxSum
```


# 📊 Example

### Input

```id="7q1wve"
nums = [3,5,2,3]
```

### After sorting

```id="y2l7s3"
[2,3,3,5]
```

### Pairing

| Pair  | Sum |
| ----- | --- |
| 2 + 5 | 7   |
| 3 + 3 | 6   |

Maximum = **7**

---

# ⏱ Complexity

### Time Complexity

```id="5z1j3u"
O(n log n)
```

(due to sorting)

---

### Space Complexity

```id="9v9t0u"
O(1)
```

---

