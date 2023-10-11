package LinkedLists;

public class Question5 {

    //merge k sorted lists : https://leetcode.com/problems/merge-k-sorted-lists/description/

    //         /**
    //  * Definition for singly-linked list.
    //  * public class ListNode {
    //  *     int val;
    //  *     ListNode next;
    //  *     ListNode() {}
    //  *     ListNode(int val) { this.val = val; }
    //  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    //  * }
    //  */

    // class Solution {
    //     public ListNode merge(ListNode l1, ListNode l2){
    //         ListNode temp = new ListNode(-1);
    //         ListNode ptr = temp;
    //         while(l1 != null && l2 != null){
    //             if(l1.val <l2.val){
    //                 ptr.next = l1;
    //                 l1 = l1.next;
    //             }else{
    //                 ptr.next = l2;
    //                 l2 = l2.next;
    //             }
    //             ptr = ptr.next;
    //         }

    //         if(l1 != null) ptr.next = l1;
    //         else ptr.next = l2;

    //         ptr = temp.next;
    //         temp.next = null;
    //         return ptr;
    //     }

    //     public ListNode mergeList(ListNode[] lists, int s, int e){
    //         if(s == e) return lists[s];

    //         int mid = s + (e-s)/2;
    //         ListNode left = mergeList(lists, s, mid);
    //         ListNode right = mergeList(lists, mid+1, e);

    //         return merge(left, right);
    //     }

    //     public ListNode mergeKLists(ListNode[] lists) {
    //         if(lists.length == 0) return null;
    //         if(lists.length == 1) return lists[0];
    //         return mergeList(lists, 0, lists.length-1);
    //     }
    // }
}
