
# 📌 XOR After Queries — Solution (Java)

## 🧩 Problem Summary

You are given:

* An integer array `nums`
* A list of queries `queries[][]`

Each query contains **4 values**:

```
[idx, r, k, v]
```

For every query:

* Start from index `idx`
* Update elements up to index `r`
* Move with step size `k`
* Multiply each selected element by `v`
* Take modulo `10^9 + 7`

After applying **all queries**, return the **XOR of all elements** in the updated array.

---

## 🧠 Approach

### Step 1: Process Each Query

For every query:

```
[idx, r, k, v]
```

Update:

```
nums[idx] *= v
nums[idx+k] *= v
nums[idx+2k] *= v
...
until index ≤ r
```

Apply modulo:

```
nums[i] = (nums[i] × v) % (10^9 + 7)
```

---

### Step 2: Compute Final XOR

After all queries are processed:

```
xor = nums[0] ^ nums[1] ^ nums[2] ^ ... ^ nums[n-1]
```

Return the result.

---


## ⏱ Time Complexity

Let:

```
n = size of nums
q = number of queries
```

Worst case:

```
O(q × (range/k))
≈ O(q × n)
```

So performance depends on:

* number of queries
* step size `k`
* range length `(r − idx)`

---

## 📦 Space Complexity

```
O(1)
```

No extra space used except variables.

---

## ✅ Key Concepts Used

* Array traversal with step size
* Modular arithmetic
* Bitwise XOR operation
* Simulation-based query processing

---

## 🎯 Final Output

Return:

```
XOR of array after applying all queries
```

---
