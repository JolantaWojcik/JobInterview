package designpatterns;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import designpatterns.Osoba.OsobaFactory;
import proxy.OsobaProxy;
import proxy.PobierzDaneOsoby;

//TODO: wyjasnic enumy
//TODO: wyjasnic mockowanie


//czym sie rozni mock od stub'a. - testowanie.

public class Examples {
	// singleton - anti pattern - ciezko go testowac, a konkretnie MOCKOWAC
	// clean code: poprzez enum
	
	public static void main(String[] args) {
		MySingleton.INSTANCE.mojaMetoda();
		
		//Jakie znasz wzorce projektowe w JDK ktore sa popularnie uzywane?
		
		//iterator - abstrakcyjny sposb przegladania kolekcji
		//iterator dostaracza Ci sposob przegladania kolekcji bez przejmowania sie tym jak ona jest 
		//"wewnatrz" zbudowana
		
		
		Set<Integer> tab = new HashSet<>(Arrays.asList(5,4,3));
		
//		Iterator<Integer> iteraotr = tab.iterator();
//		while(iteraotr.hasNext()){
//			System.out.println(iteraotr.next());
//		}
		System.out.println("-----");
		//tablicy,
		//listy
		//zbioru
		
		//dziala tak samo!
		
		//foreach - wykorzustuje "iteratora"
		
		int[] tab1 = {1,2,3};
		List<Integer> lista = Arrays.asList(1,2,3);
		
		for(int i=0; i<tab1.length; i++){
			System.out.println(tab1[i]);
		}
		
		for(int i=0; i<lista.size(); i++){
			System.out.println(lista.get(i));
		}
		
		for(int i: tab){
			System.out.println(i);
		}
		
		//decorator - pozwala dynamiczna wzbogacac projekt o jakies nowe funkcje.
		//io.streams
		try {
//			FileWriter fw = new FileWriter("dane.txt");
//			fw.write("teskt");
//			fw.write("\n");
//			fw.write("test2");
//			fw.close();
//			
//			BufferedWriter buf = new BufferedWriter(new FileWriter("dane.txt"), 100);
//			buf.write("tekst");
//			buf.newLine();
//			buf.write("test2");
//			buf.close();
//			
//			FileReader fr = new FileReader("");
//			BufferedReader br = new BufferedReader(fr, 100);
			
			JFrame ramka = new JFrame("ramka");
			
			JTextArea obszarTekstowy = new JTextArea();
			JScrollPane scroll = new JScrollPane(obszarTekstowy);
			scroll.setPreferredSize(new Dimension(300, 200));
			
			
			ramka.add(scroll);
			
			ramka.pack();
			ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka.setVisible(true);
			
			//factory - ktory pozwala Ci stworzyc obiekt "nazwany konstruktor"
			
			Osoba bezdomny = OsobaFactory.stworzBezrobotnego("jan", "kowalski", "....");
			
			//Builder - sluzy do tworzenia obiektow.
			//konkretnie: jesli obiekt ma bardzo duzo opcjonalnych abtrybutow i nie mozemy uzyc wzorca 
			//Factory (poniewaz istnieje bardzo duza ilosc roznych sensownych kombinacji)
			
			//Osoba rozna = Osoba.builder().imie("Jan").nazwisko("kowalski").kolorOczu("zielone").waga(174).build();
			
			//Czym sie rozni wzorzec Factory od Builder
			
			
			//Proxy (jak dziala spring)
			//Delegate
			//Proxy vs Delegate vs Decorator
//			Decorator pattern is used to implement functionality on already created object, 
//			while Proxy pattern is used for controlling access to object. 
//			One more difference between Decorator and Proxy design pattern is that, 
//			Decorator doesn't create object, instead it get object in it's constructor, 
//			while Proxy actually creates objects.
			
			//The delegation design pattern allows an object to delegate one or more tasks to a helper object. 
			//Two classes are used to achieve this; the delegate and delegator, both which realise 
			//a common interface. A method (or methods) on the interface represent the functionality 
			//to be delegated. A call to the delegator calls the matching function on the delegate.

			
			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			// The interface limits access to just the methods you want
			// made accessible
			Osoba o = new Osoba("Ania", "Nowak", "90040808945");
			PobierzDaneOsoby osobaProxy = new OsobaProxy(o);
			System.out.println("\n#### " + osobaProxy.getData());

			//template method
			
			//java desing patterns interview questions.
			//http://kobietydokodu.pl/21-wzorce-projektowe/
			//https://www.tutorialspoint.com/design_pattern/design_pattern_interview_questions.htm
			//http://www.java67.com/2012/09/top-10-java-design-pattern-interview-question-answer.html
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public enum MySingleton {
		//MySingleton INSTANCE = new MySingleton();
		INSTANCE;
		public void mojaMetoda() {
			System.out.println("Wypisuje tekst");
		}
	}
	public enum Kategoria{
		HORROR(18), KOMEDIA(0), FANTASY(12), THRILLER(15);
		
		private final int minWiek;

		private Kategoria(int minWiek) {
			this.minWiek = minWiek;
		}
		
		public int getMinWiek() {
			return minWiek;
		}
	}
}
