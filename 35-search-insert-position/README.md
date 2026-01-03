# Search Insert Position

## 🧩 Problem Description

Given a **sorted array** of distinct integers and a target value, return the **index if the target is found**.  
If not, return the index where it would be **inserted in order**.

You must return the index such that the array remains sorted.

---

## 🛠️ Approach Used

### ✅ Linear Search

1. Traverse the array from left to right.
2. Compare each element with the target.
3. As soon as an element is **greater than or equal to the target**, return its index.
4. If no such element is found, return the **length of the array** (insert at the end).

This approach is simple and easy to understand.

---
