# N-Queens Solver (Java)

This project solves the classic **N-Queens problem** using a recursive backtracking algorithm.  
The program finds all possible ways to place `N` queens on an `N × N` chessboard so that no two queens attack each other.

---

## Features
- Solves the problem for any board size `N`
- Generates and prints all valid solutions
- Labels each solution with a counter
- Simple console-based output with `Q` for queens and `[]` for empty cells

---

## Example
**Input:**
```bash
4
```

**Output:**
```bash
solution 1
Q[][][]
[][]Q[]
[]Q[][]
[][][]Q

solution 2
[][]Q[]
Q[][][]
[][][]Q
[]Q[][]
```

---

## How to Run
```bash
javac NQueens.java
java NQueens 8
```

---

## Concepts Demonstrated

- Backtracking & Recursion
- Constraint Satisfaction (columns and diagonals)
- 2D Array Representation

---

## Project Info

- Language: Java
- Paradigm: Algorithms & Problem Solving
- Author: Justin Maher

---

## Project Structure

```
NQueens/
├── src/
│   └── NQueens.java
├── README.md
└── LICENSE
```

---

## License

This project is licensed under the terms of the MIT License
