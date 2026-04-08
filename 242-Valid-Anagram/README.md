

## 📌 Problem Statement

Given two strings `s` and `t`, determine whether they are **anagrams** of each other.

Two strings are anagrams if:

* They contain the **same characters**
* With the **same frequency**
* Order **does not matter**

Example:

```
Input:  s = "listen", t = "silent"
Output: true
```

---

## 🧠 Approach Used (Sorting Method)

Steps followed in the solution:

1️⃣ Check if string lengths are equal
If lengths differ → cannot be anagrams

2️⃣ Convert strings into character arrays

```
char[] sArray = s.toCharArray();
char[] tArray = t.toCharArray();
```

3️⃣ Sort both arrays

```
Arrays.sort(sArray);
Arrays.sort(tArray);
```

4️⃣ Compare sorted arrays

```
Arrays.equals(sArray, tArray)
```

If equal → strings are anagrams ✅
Else → not anagrams ❌

---

## ⏱️ Time & Space Complexity

Sorting dominates complexity:

```
Time Complexity: O(n log n)
Space Complexity: O(n)
```

---

## ✅ Example Execution

```
Input:
s = "listen"
t = "silent"

After sorting:
sArray = eilnst
tArray = eilnst

Output:
true
```

---

## 🧩 Alternative (Optimized Approach – Frequency Count)

Instead of sorting, you can use a frequency array (faster):

```
Time Complexity: O(n)
Space Complexity: O(1)
```

Example idea:

```
int[] freq = new int[26];
```

Increment for string `s`, decrement for string `t`.

If all values become `0` → anagram.

---


