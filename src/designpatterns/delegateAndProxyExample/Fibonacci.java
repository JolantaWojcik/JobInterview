package designpatterns.delegateAndProxyExample;

import java.math.BigInteger;
import java.util.Optional;

public class Fibonacci implements FibonacciInterface {

	private FibonacciDelagate fd;

	public BigInteger fib(int n) {
		return Optional.ofNullable(fd).orElseThrow(IllegalArgumentException::new).fib(n);
	}

	public void setDelagate(FibonacciDelagate fd) {
		this.fd = fd;
	}

	public void useIterationCounter() {
		setDelagate(new FibonacciIterationDelgate());
	}

	public void useRecursionCounter() {
		setDelagate(new FibonacciRecursionDelagate());
	}
}
