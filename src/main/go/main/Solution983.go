func mincostTickets(days []int, costs []int) int {
	lastDay := days[len(days) - 1]
	dp := make([]int, lastDay + 1)
	isTravelDays := make([]bool, lastDay + 1)
	for _, e := range days {
		isTravelDays[e] = true
	}

	for i := 1; i <= lastDay; i++ {
		// 不需要购票
		if !isTravelDays[i] {
			dp[i] = dp[i - 1]
			continue
		}

		// 选择买票的方式
		dp[i] = costs[0] + dp[i - 1]
		dp[i] = min(costs[1] + dp[max(i - 7, 0)], dp[i])
		dp[i] = min(costs[2] + dp[max(i - 30, 0)], dp[i])
	}
	return dp[lastDay]
}

func min(a int, b int) int {
	if a < b {
		return a
	}
	return b
}

func max(a int, b int) int {
	if a < b {
		return b
	}
	return a
}