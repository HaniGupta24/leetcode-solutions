

# Bitwise Complement of a Number

## Problem

Given a non-negative integer `n`, return the **bitwise complement** of its binary representation.

The **bitwise complement** means:

* Change every `0` → `1`
* Change every `1` → `0`

Example:

| n  | Binary | Complement | Result |
| -- | ------ | ---------- | ------ |
| 5  | 101    | 010        | 2      |
| 10 | 1010   | 0101       | 5      |

---

# Approach Used

We use **bit manipulation** to flip only the bits that exist in the number.

Steps:

1. Find the **highest set bit** of the number.
2. Create a **mask of all 1s** up to that bit.
3. Use **XOR** to flip the bits.

---

# Code Explanation

```java
class Solution {
    public int bitwiseComplement(int n) {
```

This defines the function that returns the complement of integer `n`.

---

```java
if(n==0)
return 1;
```

Special case:
Binary of `0` is `0`.
Complement → `1`.

So we directly return `1`.

---

```java
int hbit = Integer.highestOneBit(n) << 1;
```

`Integer.highestOneBit(n)` returns the **largest power of 2 ≤ n**.

Example:

| n  | Binary | highestOneBit |
| -- | ------ | ------------- |
| 5  | 101    | 100 (4)       |
| 10 | 1010   | 1000 (8)      |

Then we shift left:

```
100 << 1 = 1000
```

So `hbit` becomes the **next power of two**.

---

```java
return n ^ (hbit - 1);
```

We create a **mask of all 1s**.

Example:

If `hbit = 8`

```
hbit - 1 = 7
Binary = 111
```

Now XOR with `n`.

Example:

```
n = 5  → 101
mask   → 111
----------------
XOR    → 010 = 2
```

This flips all bits.

---

# Example Walkthrough

### Input

```
n = 5
```

Binary:

```
101
```

Steps:

```
highestOneBit = 100
hbit = 1000
mask = 111
```

Now:

```
101
111
---
010
```

Output:

```
2
```

---

# Time Complexity

```
O(1)
```

---

# Space Complexity

```
O(1)
```

---


