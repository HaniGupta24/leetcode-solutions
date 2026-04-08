
# 📘 Minimum Difference Problem

## 📌 Problem Statement

Given an integer array `nums` and an integer `k`, select **any k elements** from the array such that the **difference between the maximum and minimum elements** among them is **minimum**.

Return this **minimum possible difference**.

---

## 💡 Example

### Input

```
nums = [9, 4, 1, 7]
k = 2
```

### Output

```
2
```

### Explanation

Possible selections:

```
[1,4] → difference = 3
[4,7] → difference = 3
[7,9] → difference = 2  ✅ minimum
```

So answer = **2**

---

## 🧠 Approach

### Step 1: Sort the array

Sorting groups nearby numbers together.

Example:

```
[9,4,1,7] → [1,4,7,9]
```

Now closest values appear next to each other.

---

### Step 2: Use Sliding Window of size `k`

Check every window of length `k`.

For each window:

```
difference = nums[i + k - 1] − nums[i]
```

Track the minimum difference.

---

### Step 3: Return minimum difference

Keep updating answer while scanning all windows.

---

## ✅ Algorithm Steps

1. Sort array
2. Initialize `minDiff = Integer.MAX_VALUE`
3. Loop from `0` to `n − k`
4. Compute difference:

```
nums[i + k − 1] − nums[i]
```

5. Update minimum difference
6. Return result

---


## ⏱ Time & Space Complexity

### Time Complexity

```
O(n log n)
```

Sorting dominates runtime.

Sliding window takes:

```
O(n)
```

So total:

```
O(n log n)
```

---

### Space Complexity

```
O(1)
```

No extra memory used (in-place sorting).

---

