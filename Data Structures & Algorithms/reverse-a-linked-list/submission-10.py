# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        l = []

        cur = head

        while cur:
            l.append(cur.val)
            cur = cur.next

        n = l[::-1]

        dummy = ListNode()
        fin = dummy

        for num in n:
            dummy.next = ListNode(num)
            dummy = dummy.next

        return fin.next