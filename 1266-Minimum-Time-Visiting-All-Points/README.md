

# ⏱️ Minimum Time to Visit All Points

## 📌 Problem Statement

You are given an array `points` where:

```
points[i] = [xi, yi]
```

represents a point on a **2D plane**.

Starting from **points[0]**, you must visit **every point in order**.

### Allowed Moves (1 second each)

You can move:

* **Vertically** → `(x, y ± 1)`
* **Horizontally** → `(x ± 1, y)`
* **Diagonally** → `(x ± 1, y ± 1)`

Your task is to compute the **minimum time required to visit all points**.

---

# 💡 Key Insight

To move from:

```
(x1, y1) → (x2, y2)
```

Compute the differences:

```
dx = |x1 - x2|
dy = |y1 - y2|
```

### Movement Strategy

1️⃣ Use **diagonal moves** to reduce both `dx` and `dy`.

2️⃣ Use **straight moves** to cover the remaining distance.

Thus the minimum time required is:

```
max(dx, dy)
```

---

# 🧠 Why `max(dx, dy)`?

Example:

```
Start: (1,1)
End:   (4,3)
```

```
dx = 3
dy = 2
```

Steps:

```
Diagonal → (2,2)
Diagonal → (3,3)
Horizontal → (4,3)
```

Total moves:

```
3 = max(3,2)
```

---

# 🚀 Approach

1. Traverse the array of points.
2. For each consecutive pair:

   * Compute `dx`
   * Compute `dy`
3. Add:

```
max(dx, dy)
```

to the total time.


# 📊 Example

### Input

```
points = [[1,1],[3,4],[-1,0]]
```

### Calculation

From `(1,1) → (3,4)`

```
dx = 2
dy = 3
time = 3
```

From `(3,4) → (-1,0)`

```
dx = 4
dy = 4
time = 4
```

Total:

```
3 + 4 = 7
```

Output:

```
7
```

---

# ⏱ Complexity

### Time Complexity

```
O(n)
```

We iterate through the points once.

### Space Complexity

```
O(1)
```

Only constant variables are used.

---

# 🔑 Key Concept

This problem uses **Chebyshev Distance**, which is the correct distance metric when **diagonal movement is allowed**.

Formula:

```
distance = max(|x1 - x2|, |y1 - y2|)
```

---
