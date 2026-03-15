

# Valid Palindrome (Two Pointers)

## 📌 Problem Statement

Given a string `s`, determine whether it is a **palindrome**, considering **only alphanumeric characters** and **ignoring cases**.

A string is a palindrome if it reads the **same forward and backward**.

---

# 🧠 Optimized Approach

## Two Pointers Technique

Instead of:

* Creating a new filtered string
* Reversing the string

We check the palindrome **in-place** using two pointers.

This makes the solution **memory efficient**.

---

# 🔑 Key Ideas

1️⃣ Ignore **non-alphanumeric characters**

Example characters to skip:

```
space, comma, colon, punctuation
```

---

2️⃣ Compare characters **case-insensitively**

Example:

```
'A' == 'a'
```

So we convert characters to **lowercase** before comparison.

---

3️⃣ Use **two pointers**

```
left  → start of string
right → end of string
```

Move both pointers **towards the center**.

---

# 🚀 Algorithm

### Step 1

Initialize pointers

```
left = 0
right = s.length() - 1
```

---

### Step 2

While:

```
left < right
```

Do the following:

---

### Step 3

Skip non-alphanumeric characters

```
while(left < right && !isalphanumeric)
    left++
```

```
while(left < right && !isalphanumeric)
    right--
```

---

### Step 4

Compare characters

```
if lowercase(s[left]) != lowercase(s[right])
    return false
```

---

### Step 5

Move pointers

```
left++
right--
```

---

### Step 6

If loop finishes

```
return true
```

    }


# 📊 Example

### Input

```
s = "A man, a plan, a canal: Panama"
```

After ignoring non-alphanumeric characters:

```
amanaplanacanalpanama
```

Forward = Backward

Output:

```
true
```

---

### Input

```
s = "race a car"
```

Comparison fails.

Output:

```
false
```

---

# ⏱ Complexity

### Time Complexity

```
O(n)
```

Each character is visited **at most once**.

---

### Space Complexity

```
O(1)
```

No extra data structures used.

---

# 🎯 Key Concept

This problem demonstrates the **Two Pointer Technique**, which is commonly used for:

* Palindrome checking
* Sorted array problems
* Sliding window patterns

---

