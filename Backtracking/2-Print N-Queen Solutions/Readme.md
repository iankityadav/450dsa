> **The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other.**

Example :

<table border="1">
<tr>
<td bgcolor="alice"></td>
<td>Q</td>
<td bgcolor="alice"></td>
<td></td>
</tr>
<tr>
<td></td>
<td bgcolor="alice"></td>
<td></td>
<td bgcolor="alice">Q</td>
</tr>
<tr>
<td bgcolor="alice">Q</td>
<td></td>
<td bgcolor="alice"></td>
<td></td>
</tr>
<tr>
<td></td>
<td bgcolor="alice"></td>
<td>Q</td>
<td bgcolor="alice"></td>
</tr>
</table>

<table border>
<tr>
<td bgcolor="alice"></td>
<td></td>
<td bgcolor="alice">Q</td>
<td></td>
</tr>
<tr>
<td>Q</td>
<td bgcolor="alice"></td>
<td></td>
<td bgcolor="alice"></td>
</tr>
<tr>
<td bgcolor="alice"></td>
<td></td>
<td bgcolor="alice"></td>
<td>Q</td>
</tr>
<tr>
<td></td>
<td bgcolor="alice">Q</td>
<td></td>
<td bgcolor="alice"></td>
</tr>
</table>

Each solution contains distinct board configurations of the N-queens’ placement, where the solutions are a permutation of [1,2,3..n] in increasing order, here the number in the ith place denotes that the ith-column queen is placed in the row with that number. For the example above solution is written as [[2 4 1 3 ] [3 1 4 2 ]]

```
Input: n = 4
Output: [[2 4 1 3 ] [3 1 4 2 ]]]
```