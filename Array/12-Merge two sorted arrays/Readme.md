> **We are given two sorted arrays. We need to merge these two arrays such that the initial numbers (after complete sorting) are in the first array and the remaining numbers are in the second array. Extra space allowed in O(1).**

Example :
```
Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}
```

<details>
<summary>Hint</summary>

- Traverse the arrays by keeping two pointers, from last for first array and from start for second array and swap the elements where the element is smaller in second array.
</details>