class Solution:
    def __init__(self):
        pass
    
    def f(self, i, j, dp):
        if i == 0 and j == 0:
            return 1
        if i < 0 or j < 0:
            return 0

        if dp[i][j] != -1:
            return dp[i][j]

        up = self.f(i - 1, j, dp)
        left = self.f(i, j - 1, dp)
        dp[i][j] = up + left
        return dp[i][j]

    def uniquePaths(self, m, n):
        dp = [[-1] * n for _ in range(m)]
        return self.f(m - 1, n - 1, dp)
