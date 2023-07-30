> **Given a set of time intervals in any order, our task is to merge all overlapping intervals into one and output the result which should have only mutually exclusive intervals.**

Example:
```
Input: Intervals = {{1,3},{2,4},{6,8},{9,10}}
Output: {{1, 4}, {6, 8}, {9, 10}}
Explanation: Given intervals: [1,3],[2,4],[6,8],[9,10], we have only two overlapping intervals here,[1,3] and [2,4]. Therefore we will merge these two and return [1,4],[6,8], [9,10].
```
```
Input: Intervals = {{6,8},{1,9},{2,4},{4,7}}
Output: {{1, 9}} 
```
<details>
<summary>Hint</summary>

- Sort the array by start of interval
- Compare current interval's end with next interval's start value
</details>