/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(max<nums[i]){
                max = nums[i];
            }
        }

        boolean[] seen = new boolean[max+1];

        for(int i =0;i<nums.length;i++){
            seen[nums[i]] = true;
        }
        while(head != null && head.val<=max && seen[head.val])
        {
            head = head.next;
        }

        if(head == null)
        {
            return head;
        }
        ListNode curr = head.next,prev = head;
        while(curr != null){
            if(curr.val <= max && seen[curr.val]){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}