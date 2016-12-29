package designpatterns.delegateAndProxyExample;

import java.math.BigInteger;

public class FibonacciRecursionDelagate implements FibonacciDelagate {

	@Override
	public BigInteger fib(int n) {
		if (n == 1 || n == 2) {
			return BigInteger.ONE;
		}
		return fib(n - 1).add(fib(n - 2));
	}

}
