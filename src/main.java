public class main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

// Create an instance of the Solution class
        Solution solution = new Solution();

// Call the pairSum method and store the result
        int maxSum = solution.pairSum(head);

        System.out.println("Maximum Twin Sum: " + maxSum);
    }
}
