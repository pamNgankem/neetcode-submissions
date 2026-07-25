class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = float('-inf')

        for i in range(len(prices)):
            for j in range(i, len(prices)):
                max_profit = max(max_profit, prices[j] - prices[i])

        return max_profit