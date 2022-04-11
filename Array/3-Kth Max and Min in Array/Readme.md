> **Given an array and a number k where k is smaller than the size of the array, we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.**

Example :
```
Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 4 
Output: 10 
```

<details>
<summary>Hint</summary>
Use Priority Queue of max heap to find kth smallest element in an array by storing only k elements atmost in the heap. The top element in the heap, after this process, would be the kth smallest element. (Optimal Solution)
</details>