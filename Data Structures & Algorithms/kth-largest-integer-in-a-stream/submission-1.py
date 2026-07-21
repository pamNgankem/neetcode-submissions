class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.stream = nums
        self.stream.sort()

    def add(self, val: int) -> int:
        self.stream.insert(self.getIndex(val), val)
        return self.stream[len(self.stream) - self.k]

    def getIndex(self, val:int):
        l = 0
        r = len(self.stream) - 1

        while l <= r:
            mid = (r + l) // 2

            if self.stream[mid] == val:
                return mid
            elif self.stream[mid] < val:
                l = mid + 1
            else:
                r = mid - 1

        return l
                

