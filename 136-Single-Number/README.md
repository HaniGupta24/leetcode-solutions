

# 🔢 Single Number

## 📘 Problem Description

Given a **non-empty array** of integers `nums`:

* Every element appears **twice**
* Except for **one element**, which appears **only once**

---

## 🎯 Objective

Find and return the **element that appears only once**.

---

# 🧠 Intuition

Duplicate numbers **cancel each other out**.

We use the **XOR Bit Manipulation** trick.

---

# 💡 Why XOR Works?

### Properties of XOR (`^`):

```id="1eg4ja"
a ^ a = 0
a ^ 0 = a
```

Also:

* **Commutative** → `a ^ b = b ^ a`
* **Associative** → `(a ^ b) ^ c = a ^ (b ^ c)`

---

# 🔍 Key Idea

If we XOR all elements:

```id="i2o86q"
a ^ b ^ a ^ b ^ c
```

It becomes:

```id="apflqg"
(a ^ a) ^ (b ^ b) ^ c = 0 ^ 0 ^ c = c
```

So the result is the **unique element**.

---

# 🚀 Approach (Bit Manipulation)

## Algorithm

1️⃣ Initialize:

```id="k4gmnq"
result = 0
```

2️⃣ Traverse the array:

```id="6d9hfd"
result ^= num
```

3️⃣ Return `result`

---




# 📊 Example

### Input

```id="n6dsix"
nums = [4, 1, 2, 1, 2]
```

### Step-by-step XOR

```id="jpdwy8"
result = 0 ^ 4 = 4
result = 4 ^ 1 = 5
result = 5 ^ 2 = 7
result = 7 ^ 1 = 6
result = 6 ^ 2 = 4
```

### Output

```id="wekr0i"
4
```

---

# ⏱ Complexity

### Time Complexity

```id="d9lzzg"
O(n)
```

### Space Complexity

```id="36ax3l"
O(1)
```

---

# 🔑 Key Insight

XOR helps eliminate duplicates efficiently, leaving only the **unique element**.

---


---

If you want, I can also show:

* Follow-up: **Single Number II (appears thrice)**
* Trick to solve it using **bitwise counting (very important for interviews)**
