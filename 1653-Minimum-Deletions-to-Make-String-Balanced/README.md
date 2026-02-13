

# 📌 Minimum Deletions to Make String Balanced

## 🔹 Problem Statement

Given a string `s` consisting only of characters `'a'` and `'b'`,
return the **minimum number of deletions** required so that:

> No `'b'` appears before any `'a'`.

In other words, the final string must be in this format:

```
aaaa...bbbb
```

(All `'a'` first, then all `'b'`)

---

# ✅ Stack-Based Approach (Your Active Code)

```java
class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int ans = 0;

        for(char ch : s.toCharArray()) {

            if(ch == 'b') {
                st.push('b');
            }
            else {
                if(!st.isEmpty()) {
                    ans++;
                    st.pop();
                }
            }
        }
        return ans;
    }
}
```

---

## 🔹 Logic Explanation

### Idea:

* Every time we see `'b'`, we store it.
* When we see `'a'`:

  * If there's a `'b'` before it → this is invalid (`"ba"` pattern).
  * We must delete either:

    * the previous `'b'`
    * OR the current `'a'`

Your solution chooses to:

* Delete the previous `'b'`
* Increase deletion count (`ans++`)
* Pop one `'b'` from stack

---

## 🔹 Why It Works

We are essentially:

* Matching each `'a'` with a previous `'b'`
* Removing one conflicting character
* Ensuring no `'b'` remains before `'a'`

---

## 🔹 Example

### Input:

```
s = "aababbab"
```

### Step-by-step:

| Char | Stack | Deletions |
| ---- | ----- | --------- |
| a    | empty | 0         |
| a    | empty | 0         |
| b    | b     | 0         |
| a    | empty | 1         |
| b    | b     | 1         |
| b    | b,b   | 1         |
| a    | b     | 2         |
| b    | b,b   | 2         |

### Output:

```
2
```

---

# 🔎 Time & Space Complexity

### ⏱ Time Complexity:

```
O(n)
```

### 📦 Space Complexity:

```
O(n)
```

(Worst case: all characters are `'b'`)

---

# 🚀 Optimized Version (Better Approach)

Your commented solution is actually **more optimal** 👇

```java
class Solution {
    public int minimumDeletions(String s) {
        int bcount = 0;
        int ans = 0;

        for(char ch : s.toCharArray()) {
            if(ch == 'a') {
                ans = Math.min(bcount, ans + 1);
            }
            else {
                bcount++;
            }
        }
        return ans;
    }
}
```

---

## 🔹 Why This is Better

Instead of using a stack:

* `bcount` → number of `'b'` seen so far
* When we see `'a'`:

  * Either delete this `'a'` → `ans + 1`
  * Or delete all previous `'b'` → `bcount`
  * Take minimum

### ✅ Time: O(n)

### ✅ Space: O(1) (Optimal)

---

# 🏆 Recommendation

Use the **second approach** in interviews:

* Cleaner
* Optimal
* No extra space
* Shows strong DP intuition

---


