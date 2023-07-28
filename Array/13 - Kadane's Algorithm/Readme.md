Refer [Largest Sum Contiguous Subarray](../8-Largest%20Sum%20Contiguous%20Subarray/Readme.md) problem as it uses the same algorithm.

- Define two-variable currSum which stores maximum sum ending here and maxSum which stores maximum sum so far.
- Initialize currSum with 0 and maxSum with INT_MIN.
- Now, iterate over the array and add the value of the current element to currSum and check
    - If currSum is greater than maxSum, update maxSum equals to currSum.
    - If currSum is less than zero, make currSum equal to zero.
- Finally, print the value of maxSum.
