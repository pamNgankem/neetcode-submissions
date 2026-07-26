# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:

        nodes = []

        cur = head

        while cur:
            nodes.append(cur)
            cur = cur.next
        
        l = 0
        r = len(nodes) - 1

        while l < r:
            temp = nodes[l].next
            nodes[l].next = nodes[r]
            nodes[r].next = temp
            l += 1
            r -= 1

        nodes[l].next = None