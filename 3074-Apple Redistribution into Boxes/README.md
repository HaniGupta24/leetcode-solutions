## 💡 Approach
1. Calculate the **total number of apples**
2. Sort the `capacity` array in **descending order**
3. Keep adding box capacities until total apples are covered
4. Count how many boxes were used

---

## 🧠 Algorithm
- Sum all values in `apples`
- Sort `capacity`
- Iterate from largest capacity to smallest
- Subtract capacity from total apples
- Stop when apples ≤ 0

---
