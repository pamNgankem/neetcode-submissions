class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        stack = []
        result = [0] * n

        for i in range(n):
            while stack and temperatures[i] > stack[-1][0]:
                ind = stack[-1][1]
                result[ind] = i - ind
                stack.pop()

            stack.append((temperatures[i], i))

        return result
