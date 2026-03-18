# 📌 Majority Element

## 📘 Problem Statement

Given an array `nums` of size `n`, return the **majority element**.

👉 The majority element is the element that appears **more than ⌊n / 2⌋ times**.

---

# 💡 Approach Used: Sorting

## 🧠 Idea

1. **Sort the array**
2. Return the element at index:

```id="wwr0ck"
n / 2
```

---

# 🔍 Why This Works

After sorting:

* All identical elements are **grouped together**
* The majority element appears **more than half of the array**

So it **must occupy the middle position**.

---

### 📊 Example

```id="kt3bq3"
nums = [2, 2, 1, 1, 1, 2, 2]
```

After sorting:

```id="74a50o"
[1, 1, 1, 2, 2, 2, 2]
```

Middle index:

```id="9x31pj"
n = 7 → n/2 = 3
```

Element at index 3:

```id="4ey5fi"
2
```

✔️ Correct answer

---

# 💻 Java Code

```java id="b44wy3"
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
```

---

# ⏱ Complexity

### Time Complexity

```id="yj8x2s"
O(n log n)
```

Due to sorting.

---

### Space Complexity

```id="y7q3te"
O(1)
```

(ignoring sorting space depending on implementation)

---

# 🔑 Key Insight

Because the majority element appears **more than n/2 times**, it will **always cross the midpoint** after sorting.

---

# 🚀 Better Approach (Important)

The optimal solution uses **Boyer-Moore Voting Algorithm**:

* Time: `O(n)`
* Space: `O(1)`
* No sorting needed

---
