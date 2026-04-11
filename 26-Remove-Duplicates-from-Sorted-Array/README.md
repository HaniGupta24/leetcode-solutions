
# Remove Duplicates from Sorted Array (Java)

## 📌 Problem Statement

Given a **sorted integer array** `nums`, remove duplicates **in-place** such that each unique element appears only once.

Return the number of unique elements `k`.

The first `k` elements of the array should contain the unique elements in their original order.

---

## 🧠 Approach (Two-Pointer Technique)

Since the array is already **sorted**, duplicate elements appear **next to each other**.

We use:

* One pointer `i` → to traverse the array
* One pointer `count` → to place the next unique element

### Algorithm Steps

1. If array is empty → return `0`
2. Assume first element is unique → initialize `count = 1`
3. Traverse array from index `1`
4. Compare current element with previous element
5. If different:

   * Place element at index `count`
   * Increment `count`
6. Return `count`

---

## ▶ Example

### Input

```
nums = [1,1,2,2,3]
```

### Output

```
3
```

### Updated Array

```
[1,2,3,_,_]
```

(`_` represents leftover elements beyond unique count)

---

## ⏱ Time Complexity

```
O(n)
```

Single pass through the array.

---

## 📦 Space Complexity

```
O(1)
```

No extra memory used (in-place modification).

---

## 🎯 Key Concepts Used

* Two-pointer technique
* Array traversal
* In-place modification
* Sorted array optimization

---

