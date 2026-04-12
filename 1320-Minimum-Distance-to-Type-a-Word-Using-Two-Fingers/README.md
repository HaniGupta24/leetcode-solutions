

# 📌 Minimum Distance to Type a Word Using Two Fingers 

## 🔹 Problem Idea

You are given a word (only capital letters **A–Z**).
You must type it using **two fingers** on a keyboard arranged like this:

```
A B C D E F
G H I J K L
M N O P Q R
S T U V W X
Y Z
```

Goal: **Find the minimum total distance** your fingers move while typing the word.

Distance between letters = **Manhattan Distance**

```
|x1 − x2| + |y1 − y2|
```

---

## 🔹 Approach Used

This solution uses:

✅ Recursion
✅ Dynamic Programming (Memoization)
✅ 3D DP Array

DP State:

```
dp[i][pos1][pos2]
```

Meaning:

Minimum distance needed when:

* currently typing index `i`
* finger1 at `pos1`
* finger2 at `pos2`

---

## 🔹 Key Idea

At every character:

You have **2 choices**

1️⃣ Move finger 1
2️⃣ Move finger 2

Choose the **minimum distance option**

```
min(move finger1, move finger2)
```

---

## 🔹 Function Breakdown

### 1️⃣ minimumDistance()

```
public int minimumDistance(String word)
```

Creates DP array:

```
dp[word.length()][27][27]
```

Why 27?

Because:

```
0–25 → letters A–Z
26 → represents -1 (finger not placed yet)
```

Starts recursion:

```
helper(word, 0, -1, -1)
```

Meaning:

Start typing from index 0
Both fingers not placed yet

---

### 2️⃣ helper()

```
int helper(String word, int i, int pos1, int pos2)
```

Parameters:

```
i     → current index in word
pos1  → finger1 position
pos2  → finger2 position
```

Base case:

```
if(i == word.length())
return 0
```

If word finished → no distance needed

---

### 3️⃣ Memoization Check

```
if(dp[i][pos1+1][pos2+1] != null)
return dp[i][pos1+1][pos2+1];
```

Avoid recalculating same state

We add **+1** because:

```
pos = -1 allowed
array index cannot be negative
```

---

### 4️⃣ Two Choices

Move finger 1:

```
d1 = getDist(ch, pos1)
     + helper(word, i+1, ch, pos2)
```

Move finger 2:

```
d2 = getDist(ch, pos2)
     + helper(word, i+1, pos1, ch)
```

Choose minimum:

```
Math.min(d1, d2)
```

Store result in DP

---

### 5️⃣ Distance Function

```
int getDist(int ch, int pos)
```

If finger not placed:

```
return 0
```

Otherwise compute:

```
|x1-x2| + |y1-y2|
```

Coordinates calculated as:

```
row = index / 6
column = index % 6
```

---

## 🔹 Time Complexity

```
O(N × 26 × 26)
```

Because:

```
i = word length
pos1 = 26 possibilities
pos2 = 26 possibilities
```

Efficient due to memoization ✅

---

## 🔹 Space Complexity

```
O(N × 26 × 26)
```

for DP storage

---
