package designpatterns.delegateAndProxyExample;

import java.math.BigInteger;

public interface FibonacciInterface {
	void setDelagate(FibonacciDelagate fd);

	default void useIterationCounter() {
		setDelagate(new FibonacciIterationDelgate());
	}

	default void useRecursionCounter() {
		setDelagate(new FibonacciRecursionDelagate());
	}

	BigInteger fib(int n);
}
