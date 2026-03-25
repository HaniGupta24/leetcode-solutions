
# 🔄 Rotate Array (Right Rotation by k Steps)

## 📌 Problem

Given:

```text
nums = [1,2,3,4,5,6,7]
k = 3
```

Rotate right by `k` steps.

Output:

```text
[5,6,7,1,2,3,4]
```

---

# 💡 Optimal Approach: Reversal Algorithm

Instead of shifting elements one-by-one (which costs **O(n × k)**), we reverse parts of the array.

### Steps

1️⃣ Reduce extra rotations

```java
k = k % nums.length;
```

Example:

```text
n = 7
k = 10
effective k = 3
```

---

2️⃣ Reverse entire array

```text
[1,2,3,4,5,6,7]
→
[7,6,5,4,3,2,1]
```

---

3️⃣ Reverse first `k` elements

```text
[7,6,5]
→
[5,6,7]
```

Array becomes:

```text
[5,6,7,4,3,2,1]
```

---

4️⃣ Reverse remaining elements

```text
[4,3,2,1]
→
[1,2,3,4]
```

Final result:

```text
[5,6,7,1,2,3,4]
```

---

# 🧠 Why This Works

Reversal rearranges elements efficiently without extra memory.

Instead of moving elements step-by-step:

```text
Shift → shift → shift
```

We restructure using symmetry.

---

# ✅ Java Implementation

```java
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);   // reverse whole array
        reverse(nums, 0, k - 1);   // reverse first k elements
        reverse(nums, k, n - 1);   // reverse remaining elements
    }

    private void reverse(int[] nums, int left, int right) {

        while(left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
```

---

# 📊 Complexity Analysis

### Time Complexity

```text
O(n)
```

Three reversals → still linear.

---

### Space Complexity

```text
O(1)
```

In-place rotation.

---
