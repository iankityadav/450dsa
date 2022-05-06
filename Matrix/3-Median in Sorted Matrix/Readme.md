> **We are given a row-wise sorted matrix of size r\*c, we need to find the median of the matrix given. It is assumed that r\*c is always odd.**

Examples :
```
Input : 1 3 5
        2 6 9
        3 6 9
Output : Median is 5
If we put all the values in a sorted 
array A[] = 1 2 3 3 5 6 6 9 9)
```
```
Input: 1 3 4
       2 5 6
       7 8 9
Output: Median is 5
```

<details>
<summary>Hint</summary>

- Apply binary search after finding min and max element in matrix.
</details>