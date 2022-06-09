> **Given two numbers ‘a’ and b’. Write a program to count number of bits needed to be flipped to convert ‘a’ to ‘b’.**

Examples : 
<pre>
Input : a = 10, b = 20
Output : 4
Binary representation of a is 000<span style="color: gold">0101</span>0
Binary representation of b is 00010100
We need to flip highlighted four bits in a
to make it b.
</pre>
<pre>
Input : a = 7, b = 10
Output : 3
Binary representation of a is 0000<span style="color: gold">01</span>1<span style="color: gold">1</span>
Binary representation of b is 00001010
We need to flip highlighted three bits in a
to make it b.
</pre>

<details>
<summary>Hint</summary>

1. Calculate XOR of A and B.      
        a_xor_b = A ^ B
2. Count the set bits in the above calculated XOR result.
        countSetBits(a_xor_b)
</details>