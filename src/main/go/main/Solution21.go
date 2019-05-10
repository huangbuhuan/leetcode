package main

type ListNode struct {
	Val  int
	Next *ListNode
}

func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	result := new(ListNode)
	if l1 == nil {
		result = l2
		return result
	}

	if l2 == nil {
		result = l1
		return result
	}

	if l1.Val > l2.Val {
		result.Val = l2.Val
		result.Next = mergeTwoLists(l1, l2.Next)
	} else {
		result.Val = l1.Val
		result.Next = mergeTwoLists(l1.Next, l2)
	}

	return result
}
