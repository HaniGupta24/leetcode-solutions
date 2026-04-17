

---

# Remove Element from Array (Java)

## 📌 Problem Statement

Given an integer array `nums` and an integer value `val`, remove all occurrences of `val` **in-place** from the array and return the number of remaining elements.

The order of elements may change, and no extra space should be used.

---

## 🧠 Approach Used

This solution uses the **Two-Pointer Technique**:

* Pointer `j` → traverses the entire array
* Pointer `i` → stores position of next valid element (not equal to `val`)
* If element ≠ `val`, copy it to index `i`
* Increase `i`
* Return `i` as the new length of array

This ensures removal happens **in-place** without extra memory.

---




## 📊 Example

### Input

```
nums = [3, 2, 2, 3, 4]
val = 3
```

### Output

```
Remaining count: 3
Remaining elements:
2 2 4
```

---

## ⏱ Time and Space Complexity

**Time Complexity:**

```
O(n)
```

**Space Complexity:**

```
O(1)
```

✔ Only one loop used
✔ No extra array required
✔ Efficient in-place modification

---

## 🚀 Key Concept Learned

This problem strengthens understanding of:

* Two-pointer technique
* In-place array modification
* Efficient element filtering without extra memory
