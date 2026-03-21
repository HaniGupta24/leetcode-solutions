
# 📘 Concatenation of Consecutive Binary Numbers

## 📌 Problem Statement

Given an integer `n`, return the **decimal value** of the binary string formed by concatenating the binary representations of all integers from `1` to `n`.

Return the result **modulo**:

```id="yqg8kn"
10^9 + 7
```

---

## 🔹 Example

### Input

```id="6q42hb"
n = 3
```

### Binary representations

```id="hpy0c5"
1  -> 1
2  -> 10
3  -> 11
```

### Concatenated string

```id="0y4z9v"
11011
```

### Output

```id="2m05bm"
27
```

---

# 💡 Approach

Instead of actually building the binary string (which is inefficient), we simulate it mathematically.

---

## 🧠 Key Idea

We maintain a running number:

```id="q8g0a7"
ans
```

For each number `i` from `1 → n`:

1. **Shift `ans` left** to make space
2. **Append `i`**
3. Take modulo

---

## 🔑 Important Observation

The number of bits required increases **only when `i` is a power of 2**.

---

### ✔ Detect Power of 2

Instead of:

```id="q5o8kt"
Integer.bitCount(i) == 1
```

We can use a faster trick:

```id="b8wr0v"
(i & (i - 1)) == 0
```

---

### 📊 Bit Growth

| Number | Binary | Bits |
| ------ | ------ | ---- |
| 1      | 1      | 1    |
| 2      | 10     | 2    |
| 4      | 100    | 3    |
| 8      | 1000   | 4    |

So whenever `i` is a power of 2 → **increase bit count**.

---

# 🚀 Algorithm

1. Initialize:

```id="pplvzz"
ans = 0
bits = 0
MOD = 1e9 + 7
```

2. Loop from `1 → n`:

* If `i` is power of 2 → `bits++`
* Left shift:

```id="c0v5n4"
ans = (ans << bits)
```

* Add `i`:

```id="z4k8zv"
ans = (ans + i) % MOD
```


# 📊 Dry Run (n = 3)

| i | bits | ans (binary) | ans (decimal) |
| - | ---- | ------------ | ------------- |
| 1 | 1    | 1            | 1             |
| 2 | 2    | 110          | 6             |
| 3 | 2    | 11011        | 27            |

---

# ⏱ Complexity

### Time Complexity

```id="zjx5jk"
O(n)
```

---

### Space Complexity

```id="q9h5aq"
O(1)
```

---

# 🔑 Key Insight

We simulate binary concatenation using **bit shifting**, not strings.

---

