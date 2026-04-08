

# 📌 Problem Summary

Given a string containing only:

```text
( ) { } [ ]
```

Return:

```text
true  → if brackets are valid
false → otherwise
```

A string is valid if:

✅ Every opening bracket has a matching closing bracket
✅ Order is correct
✅ Proper nesting exists

Example:

```text
()[]{}   → valid
(]       → invalid
([)]     → invalid
{[]}     → valid
```

---

# 🧠 Your Approach: Repeated Replacement Method

Idea:

Keep removing valid pairs:

```java
()
{}
[]
```

Until:

```text
string becomes empty → valid
string remains → invalid
```

### Example

```
s = "{[]}"
```

Step-by-step:

```
{[]}
{}
(empty)
```

Return:

```
true
```


---

# ⏱ Complexity of Your Method

### Time Complexity

Worst case:

```
O(n²)
```

Because each replacement scans the string again.

### Space Complexity

```
O(n)
```

New strings created repeatedly.

Works fine, but **not ideal for interviews**.

---





# 📊 Complexity (Stack Approach)

### Time Complexity

```
O(n)
```

Single traversal.

### Space Complexity

```
O(n)
```

Stack storage.

---



