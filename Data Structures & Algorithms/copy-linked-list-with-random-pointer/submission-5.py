"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return None

        dictio = {None:None}

        cur = head

        while cur:
            dictio[cur] = Node(cur.val)
            cur = cur.next
        cur = head

        while cur:
            copy = dictio[cur]
            copy.next = dictio[cur.next]
            copy.random = dictio[cur.random]
            cur = cur.next

        return dictio[head]