class Solution {
    public int pairSum(ListNode head) {
        // Calculate the length of the linked list
        int len = 0;
        ListNode tempHead = head;
        while (tempHead != null) {
            len += 2;
            tempHead = tempHead.next.next;
        }

        // Create an array to store the values of the nodes
        int[] values = new int[len];
        int counter = 0;
        tempHead = head;
        while (tempHead != null) {
            values[counter] = tempHead.val;
            counter++;
            tempHead = tempHead.next;
        }

        // Find the maximum twin sum
        int max=0;
        int pointer1=0;
        int pointer2=len-1;
        while (pointer1<pointer2)
        {
            max=Math.max(values[pointer1]+values[pointer2],max);
            pointer1++;
            pointer2--;
        }
        return max;
    }
}