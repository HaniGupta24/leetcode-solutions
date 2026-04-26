# 744. Next Greatest Letter

## Problem Statement
Given a sorted array of characters `letters` and a character `target`, return the **smallest character in the array that is strictly greater than target**.

The letters **wrap around**:
- If no character is greater than `target`, return the **first character** in the array.

### Example 1
Input:
```txt
letters = ['c','f','j'], target = 'a'
```

Output:
```txt
'c'
```

### Example 2
Input:
```txt
letters = ['c','f','j'], target = 'c'
```

Output:
```txt
'f'
```

### Example 3
Input:
```txt
letters = ['c','f','j'], target = 'j'
```

Output:
```txt
'c'
```

---

## Approach 1: Linear Search
### Idea
- Traverse the array from left to right.
- Return the first character greater than `target`.
- If none is found, return `letters[0]` (wrap-around case).

### Code
```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char ch : letters) {
            if (ch > target) {
                return ch;
            }
        }
        return letters[0];
    }
}
```

### Complexity
- **Time:** O(n)
- **Space:** O(1)

---

## Approach 2: Binary Search (Optimal)
Since the array is sorted, Binary Search can find the answer faster.

### Idea
- If `letters[mid] <= target`, move right.
- Otherwise, store possible answer and move left.
- If no answer exists, return first element (wrap-around).
---

### Complexity
- **Time:** O(log n)
- **Space:** O(1)

---

## Key Learning
✅ Use **Linear Search** for simplicity.  
✅ Use **Binary Search** when array is sorted for better performance.  
✅ Remember the **wrap-around condition**.
