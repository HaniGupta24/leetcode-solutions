# Length of Last Word

## 🧩 Problem Description

Given a string `s` consisting of words and spaces, return the **length of the last word** in the string.

A **word** is defined as a maximal substring consisting of **non-space characters only**.

---

## 🛠️ Approach

### ✅ Optimized Iterative Approach (Used)

1. **Trim** the string to remove leading and trailing spaces.
2. Start traversing the string **from the end**.
3. Count characters until a space `' '` is encountered.
4. The count obtained is the length of the last word.

This avoids using extra space like arrays or split operations.

---

## 💡 Why This Approach?

- 🚀 More efficient than splitting the string
- 🧠 Demonstrates strong string manipulation skills
- 💾 Uses **O(1)** extra space

---
