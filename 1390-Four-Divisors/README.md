

# Sum of Numbers With Exactly Four Divisors

## 📌 Problem Description

You are given an integer array `nums`.

For each number in the array:

* Find all of its **divisors**.
* If the number has **exactly 4 distinct divisors**, add the **sum of those divisors** to the final answer.
* If it has **more or fewer than 4 divisors**, ignore that number.

Return the **total sum of divisors** for all valid numbers.

---

# 💡 Approach

To efficiently find divisors, we only iterate up to **√num**.

If `i` is a divisor of `num`, then `num / i` is also a divisor.

So we add **both divisors at the same time**.

---

# 🧠 Key Ideas

### 1️⃣ Iterate up to √num

Instead of checking all numbers up to `num`, we only check:

```
1 → √num
```

This reduces complexity significantly.

---

### 2️⃣ Add both divisors

If `i` divides `num`:

```
divisors = i and num / i
```

Example:

```
num = 10

divisors:
1 and 10
2 and 5
```

Total divisors = **4**

---

### 3️⃣ Handle perfect squares

If

```
i == num / i
```

Then it is a **perfect square**, so we should add it **only once**.

Example:

```
num = 9

3 × 3
```

---

### 4️⃣ Early stopping (optimization)

If the **divisor count exceeds 4**, we stop checking because the number is already invalid.

This improves performance.

---

# 🛠 Algorithm Steps

For each `num` in `nums`:

1. Initialize:

```
count = 0
sum = 0
```

2. Loop from:

```
i = 1 → √num
```

3. If `num % i == 0`

* If `i == num/i`

  * count++
  * sum += i
* else

  * count += 2
  * sum += i + num/i

4. If `count > 4`
   break

5. If `count == 4`
   add `sum` to answer.

---

# 📊 Example

### Input

```
nums = [21, 4, 7]
```

### Checking numbers

**21**

Divisors:

```
1, 3, 7, 21
```

Count = 4
Sum =

```
1 + 3 + 7 + 21 = 32
```

---

**4**

Divisors:

```
1, 2, 4
```

Count = 3 → ignore

---

**7**

Divisors:

```
1, 7
```

Count = 2 → ignore

---

### Output

```
32
```

---

# ⏱ Complexity

### Time Complexity

```
O(n × √m)
```

Where:

* `n` = size of array
* `m` = maximum number in array

---

### Space Complexity

```
O(1)
```

Only constant extra variables are used.

---

✅ **Key Insight:**
A number has **exactly four divisors only when it is either:**

* **p³** (cube of a prime)
* **p × q** (product of two distinct primes)

---

