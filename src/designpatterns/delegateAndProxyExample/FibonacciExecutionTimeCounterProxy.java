package designpatterns.delegateAndProxyExample;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FibonacciExecutionTimeCounterProxy implements FibonacciInterface {

	private FibonacciInterface anotherImpl;

	public FibonacciExecutionTimeCounterProxy(FibonacciInterface anotherImpl) {
		this.anotherImpl = anotherImpl;
	}

	@Override
	public void setDelagate(FibonacciDelagate fd) {
		anotherImpl.setDelagate(fd);
	}

	@Override
	public BigInteger fib(int n) {
		long start = System.currentTimeMillis();
		BigInteger result = anotherImpl.fib(n);
		long end = System.currentTimeMillis();
		System.out.println("Execution time of fib(" + n + ") was: " + (end - start) + " [ms]");
		return result;
	}

}
