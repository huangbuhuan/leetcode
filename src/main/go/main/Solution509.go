package main

func fib(N int) int {
	var x = 0
	var y = 1
	for i := 0; i < N; i++ {
		x,y = y+x, x
	}
	return x
}