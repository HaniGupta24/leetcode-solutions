# Pyramid Transition Matrix (LeetCode 756)

This repository contains a Java solution for the **Pyramid Transition Matrix** problem from LeetCode.

## 🧩 Problem Statement
You are given:
- A string `bottom` representing the bottom row of a pyramid
- A list `allowed` where each string represents a valid transition

Each transition allows you to place a block on top of two adjacent blocks.
Your task is to check whether it is possible to build the pyramid up to the top.

## 💡 Approach
- Use a **HashMap** to store all possible transitions for every pair of characters
- Apply **backtracking (recursion)** to build the pyramid level by level
- If at any point no valid block can be placed, return `false`
- If the pyramid reaches the top, return `true`

## 🚀 Algorithm Used
- HashMap
- Recursion
- Backtracking

