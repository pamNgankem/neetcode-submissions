# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        prev = None
        cur = slow

        while cur:
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp

        first = head
        second = prev

        while second.next:
            temp = first.next
            first.next = second
            first = temp

            temp = second.next
            second.next = first
            second = temp





