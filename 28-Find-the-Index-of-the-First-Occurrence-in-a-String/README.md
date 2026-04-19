
# 🔍 Find the Index of the First Occurrence in a String

## 📘 Problem Description

Given two strings:

* `haystack` → the main string
* `needle` → the substring to search

Return the **index of the first occurrence** of `needle` in `haystack`.

If `needle` is not part of `haystack`, return **-1**.

---

## 🧠 Intuition

We check every possible starting position in `haystack` where `needle` could fit.

At each position:

* Compare characters one by one
* If all characters match → return index
* Otherwise move to next position

This is called **Brute Force String Matching**.

---

## 🚀 Approach (Brute Force Method)

### Algorithm Steps

1. Loop from index `0` to `haystack.length() - needle.length()`
2. For each index:

   * Compare characters of `needle` with `haystack`
3. If match found → return index
4. If loop finishes without match → return `-1`

---

          
      

## ⏱ Time Complexity

| Operation  | Complexity   |
| ---------- | ------------ |
| Outer loop | O(n)         |
| Inner loop | O(m)         |
| Total      | **O(n × m)** |

Where:

* `n = length of haystack`
* `m = length of needle`

---

## 📦 Space Complexity

```
O(1)
```

No extra space used.

---

## ⚡ Optimized Approach (Advanced)

For better performance:

Use **KMP Algorithm (Knuth–Morris–Pratt)**

Time Complexity:

```
O(n + m)
```

Recommended for large string matching problems in interviews.

---

## 🧪 Example

### Input

```
haystack = "sadbutsad"
needle = "sad"
```

### Output

```
0
```

### Explanation

The substring `"sad"` first appears at index **0**.

---



