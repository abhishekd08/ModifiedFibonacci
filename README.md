Problem Statement

Modified Fibonacci
Problem Description
As we know in Fibonacci series every number after the first two is the sum of the two preceding ones.

Instead of adding two preceding numbers, multiply them and print the result modulo 10^9+7.

Since this is easy, let’'s make it bit difficult. Let'’s say there are K numbers to begin with.

You have to find nth number, where nth number will be product of k previous numbers modulo 10^9+7.

Constraints
1<=t<=10

1<=n<=10^6

1<=k<=10

1<=k[i]<=100

Input Format
First line contains T number of test case,

In each test case

First line contains two integers n, k delimited by space

Second line contains k integers delimited by space

Output
T lines, each line contains modified Fibonacci number modulo 109+7


Explanation
Example 1

Input

1

4 3

1 2 3

Output

6

Explanation

4th modified Fibonacci number will be 1*2*3=6

Example 2

Input

1

10 3

1 2 3

Output

845114970

Explanation

4th , 5th , 6th modified Fibonacci numbers are 6 , 36 , 648 respectively

Similarly 10th modified Fibonacci number will be 845114970
