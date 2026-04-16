# 📌 Problem Logic (Correct Insight)

We need to find **minimum x** such that:

[
x ;|; (x+1) = \text{num}
]

### Case 1: If `num` is even

Return **-1**

Why?
Because:

```
x | (x+1)  → always produces an odd number
```

Example:

```
2 | 3 = 3
4 | 5 = 5
6 | 7 = 7
```

So result is always **odd**, never even.

✔ Therefore:

```
if num % 2 == 0 → answer = -1
```

---

# 📌 Case 2: If `num` is odd

Your observation is correct:

> Binary representation of odd numbers ends with **1**

But the step:

> unset the lowest set bit

❌ This is **not always correct**

Instead:

### Correct idea

Find the **rightmost 0-bit before the last sequence of 1s**, then flip it.

---

# 📌 Example Understanding

Example:

```
num = 7
binary = 111
```

Try smallest x:

```
x = 3
binary = 011

x+1 = 4
binary = 100

3 | 4 = 7 ✅
```

So answer:

```
x = 3
```

---

Example:

```
num = 11
binary = 1011
```

Answer:

```
x = 9
binary = 1001

9 | 10 = 11 ✅
```

---

# 📌 Correct Bit Trick Formula

For odd numbers:

```
x = num ^ (num >> 1)
```

Actually better logic:

```
x = num - (lowest power of 2 inside trailing 1s)
```

But simplest working approach:

### Efficient method

```
x = num & (num - 1)
```

---

# 📌 Final Algorithm (Best Approach)

```
for each num:

    if even:
        ans[i] = -1
    else:
        ans[i] = num & (num - 1)
```



# 📌 Time Complexity

```
O(n)
```

Very efficient ✅

---
