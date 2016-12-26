package proxy;

import designpatterns.Osoba;

public class OsobaProxy implements PobierzDaneOsoby{
	private String imie, nazwisko, pesel;
	
	public OsobaProxy(String imie, String nazwisko, String pesel){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
	}

	public String getData() {
		Osoba osoba = new Osoba(imie, nazwisko, pesel);
		return osoba.getData();
	}

}
