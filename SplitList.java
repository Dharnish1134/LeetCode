class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        int size =0;
        ListNode current =  head;
        while(current != null)
        {
            size++;
            current = current.next;
        }

        int splitSize = size/k;
        int remainingSize = size%k;

        current = head;
        ListNode prev = current;
        for(int i =0;i<k;i++)
        {
            ListNode newPart = current;
            int currSize = splitSize;
            if(remainingSize>0)
            {
                remainingSize--;
                currSize++;
            }

            int j =0;
            while(j<currSize)
            {
                prev = current;
                current = current.next;
                j++;
            }

            if(prev != null)
            {
                prev.next = null;
            }

            ans[i] = newPart;
        }
        return ans;
    }
}