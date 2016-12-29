package designpatterns.delegateAndProxyExample;

import java.math.BigInteger;

public class FibonacciValidatorProxy implements FibonacciInterface {

	private FibonacciInterface anotherImpl;

	public FibonacciValidatorProxy(FibonacciInterface anotherImpl) {
		this.anotherImpl = anotherImpl;
	}

	@Override
	public BigInteger fib(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("N should be greater then 1");
		}
		return anotherImpl.fib(n);
	}

	@Override
	public void setDelagate(FibonacciDelagate fd) {
		anotherImpl.setDelagate(fd);
	}

}
