package designpatterns.delegateAndProxyExample;

public class Main {
	public static void main(String[] args) {
		FibonacciInterface fibonacci = new FibonacciExecutionTimeCounterProxy(new FibonacciValidatorProxy(new Fibonacci()));
		
		fibonacci.useIterationCounter();
		System.out.println(fibonacci.fib(40));

		fibonacci.useRecursionCounter();
		System.out.println(fibonacci.fib(40));
	}
}
