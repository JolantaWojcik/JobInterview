package ocp;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Employee();
		Employee e1 = new Employee();

		System.out.println(p1.x + " " + p1.getX()); // 5 6
		System.out.println(p2.x + " " + p2.getX()); // 10 5%!!!, 10
		System.out.println(e1.x + " " + e1.getX()); // 10, 10

		// polimorfizm w javie dotyczy TYLKO metod
		//od javy 1.7 powstaw nowy interfejs "AutoCloseable"
		try (FileInputStream in = new FileInputStream("file.txt")) { // try with
																		// resource (auto close)
			// logike wczytujaca z pliku

			// typowy przyk³ad potecjalnego wycieku pamieæi "memory leak"
			// memory leak to taka pamiec ktora nigdy nie zostanie usunieta
			// przez GC.
		} catch (Exception e) {
			// cokolwiek w catchu np: e.printStackTrace();
		}
	}

	static class Person  {
		int x = 5;

		public int getX() {
			return 6;
		}

	}

	static class Employee extends Person {
		int x = 10;

		@Override
		public int getX() {
			return 10;
		}
	}
}
