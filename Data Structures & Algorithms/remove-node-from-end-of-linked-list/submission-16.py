# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)

        dummy.next = head

        cur = head
        length = 0

        while cur:
            length += 1
            cur = cur.next

        length -= n

        i = 0
        cur = dummy

        while i < length:
            cur = cur.next
            i += 1

        cur.next = cur.next.next
        return dummy.next