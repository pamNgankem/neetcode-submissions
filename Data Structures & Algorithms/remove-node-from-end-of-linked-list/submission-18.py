# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        l = 0

        cur = head


        while cur:
            l += 1
            cur = cur.next

        position = l - n

        if position == 0:
            head = head.next

        cur = head
        
        for i in range(l - 1):
            if i + 1 == position:
                cur.next = cur.next.next
                break
            cur = cur.next

        return head