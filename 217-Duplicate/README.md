
## 📌 Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

---

## 🧠 Approach Used: HashSet (Optimal Solution)

We use a **HashSet** to track elements while iterating through the array.

### Steps:

1. Create an empty `HashSet`.
2. Traverse each element of the array.
3. Try inserting each element into the set.
4. If insertion fails (element already exists), return `true`.
5. If loop completes without duplicates, return `false`.

---

## 💻 Java Implementation

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int arr : nums){
            if(!set.add(arr)){
                return true;
            }
        }
        return false;
    }
}
```

---

## ⏱ Time Complexity

| Operation         | Complexity   |
| ----------------- | ------------ |
| Traversal         | O(n)         |
| HashSet insertion | O(1) average |

**Overall Time Complexity:** O(n)

---

## 📦 Space Complexity

We store elements in a HashSet:

**Space Complexity:** O(n)

---

## 🔁 Alternative Approach: Sorting

### Steps:

1. Sort the array.
2. Compare adjacent elements.
3. If any two adjacent elements are equal → duplicate found.

### Complexity:

| Operation | Complexity |
| --------- | ---------- |
| Sorting   | O(n log n) |
| Traversal | O(n)       |

**Overall Time Complexity:** O(n log n)

---

.
