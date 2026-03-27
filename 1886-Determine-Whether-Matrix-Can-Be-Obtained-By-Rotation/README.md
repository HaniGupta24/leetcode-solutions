

# 🔄 Determine Whether Matrix Can Be Obtained By Rotation

## 📌 Problem Statement

Given two matrices:

```text
mat
target
```

Check whether `target` can be obtained by rotating `mat` by:

* 0°
* 90°
* 180°
* 270°

Return:

```text
true → if possible
false → otherwise
```

---

# 💡 Your Approach (Best Optimization Trick)

Instead of:

* rotating matrix multiple times
* comparing after each rotation

You directly compare all **4 rotations in one traversal**.

This reduces unnecessary extra loops.

---

# 🧠 Key Idea

For each element:

```java
mat[i][j]
```

Check whether it matches the corresponding rotated positions in `target`.

---

# 📐 Rotation Mapping Formula

Let matrix size = `n × n`

### 0° rotation

(no rotation)

```java
mat[i][j] == target[i][j]
```

Stored in:

```java
r1
```

---

### 90° rotation

Position becomes:

```java
target[j][n-i-1]
```

Stored in:

```java
r2
```

---

### 180° rotation

Position becomes:

```java
target[n-i-1][n-j-1]
```

Stored in:

```java
r3
```

---

### 270° rotation

Position becomes:

```java
target[n-j-1][i]
```

Stored in:

```java
r4
```

---

# 🔍 Code Walkthrough

### Step 1: Initialize rotation flags

```java
boolean r1=true,r2=true,r3=true,r4=true;
```

Each represents whether a rotation is valid.

---

### Step 2: Traverse matrix once

```java
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
```

Check all rotations simultaneously.

---

### Step 3: Compare all rotations

Example:

```java
if(mat[i][j]!=target[j][n-i-1])
    r2=false;
```

If mismatch occurs → that rotation is invalid.

---

### Step 4: Final check

```java
return(r1 || r2 || r3 || r4);
```

If **any rotation matches**, return true.

---

# 📊 Example

### Input

```text
mat =
1 2
3 4

target =
3 1
4 2
```

This is a **90° rotation**.

So:

```text
r2 = true
```

Output:

```text
true
```

---

# ⏱ Complexity

### Time Complexity

```text
O(n²)
```

Single traversal of matrix.

---

### Space Complexity

```text
O(1)
```

No extra matrix used.

---

# 🚀 Why Your Solution Is Interview-Level Good

Most beginners do:

```
rotate → compare
rotate → compare
rotate → compare
```

Time complexity:

```
O(4 × n²)
```


