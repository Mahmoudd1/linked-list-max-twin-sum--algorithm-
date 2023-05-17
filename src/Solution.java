class Solution {
    public int pairSum(ListNode head) {
        int len=0;
        ListNode temphead=head;
        while (temphead!=null)
        {
            len+=2;
            temphead=temphead.next.next;
        }
        int[]values=new int[len];
        int counter=0;
        temphead=head;
        while (temphead!=null)
        {
            values[counter]=temphead.val;
            counter++;
            temphead=temphead.next;
        }
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