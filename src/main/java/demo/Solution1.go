package main

func twoSum(nums []int, target int) []int {
	for i, item := range nums {
		for j, item2 := range nums {
			if item + item2 == target {
				return []int{i,j}
			}
		}
	}
	return nil
}
