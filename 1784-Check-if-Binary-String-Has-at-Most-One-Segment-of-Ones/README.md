# 📘 Check If Binary String Has at Most One Segment of Ones

### 🔹 Problem

**Check If Binary String Has at Most One Segment of Ones**

---

## 🧩 Problem Statement

Given a **binary string `s`**, determine whether it contains **at most one contiguous segment of `1`s**.

Return:

* `true` → if there is **only one segment of `1`s**
* `false` → if there are **multiple separated segments of `1`s**

A **segment** means a continuous group of characters.

---

## 💡 Key Idea

A valid binary string with **only one segment of `1`s** must follow this pattern:

```
111...11000...000
```

Meaning:

1. First → continuous `1`s
2. Then → continuous `0`s
3. After `0`s → **no `1` should appear again**

If another `1` appears later, then there are **multiple segments of `1`s**.

---

## 🛠 Approach

1. Start from index `0`.
2. Skip all initial `1`s.
3. Skip all following `0`s.
4. If the pointer reaches the end of the string → valid.
5. If any `1` appears after `0`s → invalid.



## 🔍 Example

### Input

```
s = "110"
```

### Process

```
Skip 1s → "11"
Skip 0s → "0"
End of string
```

### Output

```
true
```

---

### Input

```
s = "1001"
```

### Process

```
Skip first 1
Skip 00
Found another 1
```

### Output

```
false
```

---

## ⏱ Complexity Analysis

| Complexity       | Value    |
| ---------------- | -------- |
| Time Complexity  | **O(n)** |
| Space Complexity | **O(1)** |

* The string is scanned at most **once**.
* No extra memory is used.

---

