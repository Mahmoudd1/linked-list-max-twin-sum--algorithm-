# linked-list-max-twin-sum--algorithm
This repository contains a Java solution to the problem of finding the maximum twin sum of a linked list. 
The problem involves finding pairs of nodes in the linked list and calculating their sum. 
The algorithm ensures that the maximum possible sum is returned.

## Problem Description

In a linked list of size `n`, where `n` is even, the `ith` node (0-indexed) of the linked list is considered the twin of the `(n-1-i)th` node. The twin sum is the sum of a node and its twin. The task is to find the maximum twin sum in a given linked list.

## Solution

The solution is implemented in Java and the code can be found in the [Solution.java](src/Solution.java) file.
## Approach

The algorithm follows the following approach:

1. Traverse the linked list to determine the length of the list.
2. Create an array to store the values of the nodes.
3. Traverse the linked list again to populate the values array.
4. Initialize pointers at the beginning and end of the values array.
5. Iterate over the values array, calculating the sum of pairs using the pointers and updating the maximum sum.
6. Return the maximum sum as the result.



## Complexity Analysis

The algorithm has a time complexity of O(n), where n is the number of nodes in the linked list. This is because the algorithm traverses the linked list twice, and the size of the values array is directly proportional to the number of nodes. The space complexity is O(n) as well since the algorithm creates an array to store the values of the nodes.

## Example

Here is an example demonstrating the usage and expected output of the algorithm:

```java
// Create a linked list: 1 -> 2 -> 3 -> 4
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next = new ListNode(4);

// Create an instance of the Solution class
Solution solution = new Solution();

// Call the pairSum method and store the result
int maxSum = solution.pairSum(head);

System.out.println("Maximum Twin Sum: " + maxSum);
