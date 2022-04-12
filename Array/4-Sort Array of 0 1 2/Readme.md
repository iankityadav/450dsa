> **Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.**

Examples :
```
Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
```

<details>
<summary>Hint #1</summary>
 Count the number of 0s, 1s and 2s in the given array. Then store all the 0s in the beginning followed
 by all the 1s then all the 2s.
</details>

<details>
<summary>Hint #2</summary>
Use three indexes to handle low, mid and high elements as 0s, 1s and 2s. (Optimal Solution)
</details>