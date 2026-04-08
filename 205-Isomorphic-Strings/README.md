
# 🔤 Isomorphic Strings

## 📌 Problem Statement

Two strings `s` and `t` are **isomorphic** if:

* Each character in `s` maps to **exactly one** character in `t`
* No two different characters in `s` map to the **same character** in `t`
* Character order remains preserved

Example:

```text
egg → add   ✅ isomorphic
foo → bar   ❌ not isomorphic
paper → title ✅ isomorphic
```

---

# 🧠 Approach (HashMap + HashSet)

We maintain:

```text
HashMap<Character, Character>  → mapping s → t
HashSet<Character>             → track already mapped characters in t
```

Why both?

* HashMap ensures **consistent mapping**
* HashSet ensures **no duplicate target mapping**

This guarantees **one-to-one mapping (bijection)** ✅

---

# ✅ Algorithm Steps

### Step 1: Length check

```java
if(s.length() != t.length())
    return false;
```

Different sizes → impossible mapping

---

### Step 2: Traverse both strings

For each index `i`:

Case 1️⃣ mapping already exists

```java
if(map.containsKey(sChar))
```

Check:

```java
map.get(sChar) == tChar
```

If mismatch → return false

---

Case 2️⃣ mapping does NOT exist

Check whether `tChar` already mapped earlier

```java
if(set.contains(tChar))
    return false;
```

Otherwise create mapping



---

# 📊 Example Walkthrough

Example:

```text
s = paper
t = title
```

Mapping builds like:

```text
p → t
a → i
p → t (already correct)
e → l
r → e
```

No conflicts ✅

Return:

```text
true
```

---

# ⏱ Complexity Analysis

### Time Complexity

```text
O(n)
```

Single traversal

---

### Space Complexity

```text
O(1)
```
