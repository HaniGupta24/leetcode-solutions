
# 📌 Problem Summary

Given a binary string `s`, you can:

* rotate the string any number of times
* flip characters (`0 → 1`, `1 → 0`)

Return the **minimum flips required** to make **any rotation** of `s` alternating.

Valid alternating patterns:

```
010101...
101010...
```

---

# 💡 Key Insight

Rotation makes this tricky.

Example:

```
s = 111000
```

Rotations:

```
111000
110001
100011
000111
001110
011100
```

We must check **all rotations efficiently**.

---

# 🚀 Your Approach (Optimal Strategy)

Instead of rotating manually:

You created:

```java
String str = s + s;
```

This allows checking **every rotation as a sliding window of size `n`**.

Smart trick ✅

---

# 🧠 Algorithm Idea

Maintain mismatch counts for:

```
Pattern 1 → starts with 0
Pattern 2 → starts with 1
```

Use sliding window of length `n`.

At each window:

```
calculate flips needed
update answer
remove leftmost char effect
```

---

# 🔍 Step-by-Step Logic

## Step 1: Double the string

```java
String str = s + s;
```

Now every substring of length `n` represents a rotation.

Example:

```
s = 101
str = 101101
```

Windows:

```
101
011
110
```

All rotations covered.

---

# Step 2: Maintain mismatch counters

```java
int onestart = 0;
int zerostart = 0;
```

They represent flips needed for:

```
101010...
010101...
```

respectively.

---

# Step 3: Traverse doubled string

```java
for(int i=0; i<2*n; i++)
```

Check mismatch at index `i`.

---

# Step 4: Compare expected alternating characters

Even index:

```
010101 expects 0
101010 expects 1
```

Odd index:

```
010101 expects 1
101010 expects 0
```

Update mismatch counters accordingly.

---

# Step 5: Apply sliding window

Once window size reaches `n`:

```java
if(i >= n-1)
```

Now window represents a rotation.

Update answer:

```java
ans = Math.min(ans, Math.min(zerostart, onestart));
```

---

# Step 6: Remove outgoing character effect

Remove contribution of:

```
i - n + 1
```

from mismatch counts.

This keeps window size fixed.

Smart sliding-window maintenance ✅

---

# 📊 Example

Input:

```
s = 111000
```

Algorithm checks all rotations:

```
111000
110001
100011
000111
001110
011100
```

Finds minimum flips automatically.
---

# ⏱ Complexity

### Time Complexity

```
O(n)
```

Single traversal of doubled string.

---

### Space Complexity

```
O(n)
```

Because:

```
str = s + s
```

---
