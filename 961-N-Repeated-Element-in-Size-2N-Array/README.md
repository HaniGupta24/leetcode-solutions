
# 961. N-Repeated Element in Size 2N Array

## 📌 Problem Overview

You are given an integer array `nums` of size `2N` such that:

* There are exactly **N + 1 unique elements**
* **One element is repeated N times**
* All other elements appear **only once**

## 🎯 Goal

Return the element that is repeated **N times**.

---

## 🧠 Approach & Intuition

Since one element appears **multiple times (N times)** and all others appear only once, the **first duplicate element we encounter while iterating** must be the answer.

We can efficiently detect this using a **HashSet**:

### Steps:

1. Create an empty `HashSet`
2. Traverse the array
3. If element already exists in the set → return it immediately
4. Otherwise, add it to the set
5. Continue until duplicate is found

Because only one element repeats multiple times, this guarantees a quick solution.

---


## ⏱️ Complexity Analysis

| Operation      | Complexity   |
| -------------- | ------------ |
| Traversal      | O(N)         |
| HashSet lookup | O(1) average |
| Space          | O(N)         |

**Overall Complexity:**

* Time → **O(N)** ⚡
* Space → **O(N)** 📦

---

