package designpatterns.delegateAndProxyExample;

import java.math.BigInteger;

public class FibonacciIterationDelgate implements FibonacciDelagate {

	@Override
	public BigInteger fib(int n) {
		if (n == 1 || n == 2) {
			return BigInteger.ONE;
		}
		BigInteger actual = BigInteger.ONE;
		BigInteger prev = BigInteger.ONE;
		BigInteger lastPrev = BigInteger.ONE;
		for (int i = 2; i < n; i++) {
			actual = prev.add(lastPrev);
			lastPrev = prev;
			prev = actual;
		}
		return actual;
	}

}
