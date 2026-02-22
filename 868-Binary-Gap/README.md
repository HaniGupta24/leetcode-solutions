Binary Gap
📌 Problem Statement

Given a positive integer n, return the longest distance between two consecutive 1s in the binary representation of n. If there are no two consecutive 1s, return 0.

🔹 The distance between two 1s is the absolute difference between their bit positions.

🧠 Approach

Traverse through all 32 bits of the integer.

Check the least significant bit using bitwise AND (n & 1).

Track the position of the previous 1 bit.

When another 1 is found:

Calculate the distance between current position and previous position.

Update the maximum distance.

Right shift (n >> 1) to check the next bit.

Return the maximum distance found.


⏱️ Time Complexity

O(32) → Constant time

Since an integer has 32 bits, the loop runs at most 32 times.

📦 Space Complexity

O(1) → Constant space

Only a few variables are used.

🧪 Example

Input:

n = 22

Binary Representation:

10110

Output:

2

Explanation: The longest distance between two consecutive 1s is 2.

🚀 Key Concepts Used

Bit Manipulation

Bitwise AND (&)

Right Shift (>>)

Position Tracking

