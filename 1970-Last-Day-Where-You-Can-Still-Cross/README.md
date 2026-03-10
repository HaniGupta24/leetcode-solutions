

## 📌 Problem Summary

You are given a grid of size **`row × col`** that initially contains **only land**.

Each day, some cells become **flooded (water)** according to the `cells` array.

Your task is to find the **latest day** when it is still possible to **walk from the top row to the bottom row** using only **land cells**.

### Allowed Moves

From any cell you can move:

* Up
* Down
* Left
* Right

You **cannot step on flooded cells**.

---

# 💡 Approach

## Binary Search + BFS

Instead of checking every day sequentially, we **binary search the answer**.

For a given day `d`:

1. Flood the first `d` cells.
2. Check if we can still **reach the bottom row** from the **top row** using **BFS**.

---

# 🧠 Key Observations

This problem has **monotonic behavior**:

* If crossing **is possible on day `d`**, it will also be possible for **all days `< d`**
* If crossing **is not possible on day `d`**, it will **not be possible for any day `> d`**

Because of this property, **binary search works perfectly**.

---

# 🛠 Algorithm Steps

## 1️⃣ Binary Search

Search the latest valid day.

```
left = 1
right = cells.length
```

While `left <= right`:

1. Compute

```
mid = (left + right) / 2
```

2. Check if crossing is possible on **day = mid**

3. If crossing **is possible**

```
answer = mid
left = mid + 1
```

4. If crossing **is not possible**

```
right = mid - 1
```

---

## 2️⃣ BFS Validation

To check if crossing is possible:

1. Create a grid.
2. Mark the first **`mid` cells as flooded**.
3. Start **BFS from every non-flooded cell in the top row**.
4. Explore using **4 directions**.

If BFS reaches the **bottom row**, crossing is possible.

---

# 📊 Example Idea

Grid:

```
Land Land Land
Land Land Land
Land Land Land
```

As days pass, some cells turn into water.

Binary search finds the **last day when a path still exists** from **top → bottom**.

---

# ⏱ Complexity

### Time Complexity

```
O((row × col) × log(row × col))
```

Explanation:

* Binary search → `log(n)`
* BFS each time → `O(row × col)`

---

### Space Complexity

```
O(row × col)
```

Used for:

* Grid
* Visited array
* BFS queue

---

# 🚀 Key Insight

Instead of simulating **every day**, we combine:

* **Binary Search → find the last valid day**
* **BFS → check if crossing is possible**

This reduces the problem from **linear simulation** to **logarithmic search**.

---

