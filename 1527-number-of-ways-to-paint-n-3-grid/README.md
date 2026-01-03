# Number of Ways to Paint N × 3 Grid

## 🧩 Problem Description

You are given an integer `n`. You need to count the number of ways to paint an `n × 3` grid using **3 different colors**, such that:

- No two adjacent cells in the **same row** have the same color
- No two adjacent cells in the **same column** have the same color

Return the answer modulo **10⁹ + 7**.

---

## 🧠 Key Insight

Each row can be painted in **two distinct patterns**:

### 🔹 Pattern Types
1. **ABA pattern (type 0)**  
   - First and third cells have the same color  
   - Example: `Red Blue Red`

2. **ABC pattern (type 1)**  
   - All three cells have different colors  
   - Example: `Red Blue Green`

---

## 🛠️ Dynamic Programming Approach

We use a DP table where:

t;= 5000</code></li>
</ul>
