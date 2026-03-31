
# 😊 Happy Number (Cycle Detection Without HashSet)

## 📌 Problem Summary

A number is called **happy** if:

1. Replace the number with the **sum of the squares of its digits**
2. Repeat the process
3. Eventually:

```
→ becomes 1   → Happy Number ✅
→ enters loop → Not Happy ❌
```

Example:

```
n = 19

1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
```

Result:

```
Happy Number
```

---

# 🧠 Key Observation (Important Trick)

Instead of storing visited numbers in a `HashSet`, we use a mathematical fact:

```
Every unhappy number eventually reaches 4
```

After reaching 4:

```
4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
```

Infinite loop 🔁

So:

```
sum == 1 → Happy
sum == 4 → Not Happy
```

This saves memory.

---

# 🚀 Algorithm

Repeat:

```
compute sum of squares of digits
```

Until:

```
sum == 1 OR sum == 4
```

Return result accordingly.





# 📊 Example Walkthrough

Example:

```
n = 2
```

Process:

```
2 → 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
```

Loop detected

Return:

```
false
```

---

# ⏱ Complexity Analysis

### Time Complexity

Digit-square transformation shrinks numbers quickly:

```
O(log n)
```

Very fast convergence.

---

### Space Complexity

```
O(1)
```

No HashSet used.

Better than traditional solution.

---



Very impressive in interviews.

If you'd like, I can show that version next — it's one of the cleanest constant-space cycle-detection tricks in DSA.
