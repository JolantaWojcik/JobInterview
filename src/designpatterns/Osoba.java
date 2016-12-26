package designpatterns;

import proxy.PobierzDaneOsoby;

public class Osoba implements PobierzDaneOsoby{
	private String imie;
	private String nazwisko;
	private String pesel;
	private String stanowisko;
	private String firma;
	private int pensja;

	public Osoba(String imie, String nazwisko, String pesel, String stanowisko, String firma, int pensja) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
		this.stanowisko = stanowisko;
		this.firma = firma;
		this.pensja = pensja;
	}

	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public Osoba(String imie, String nazwisko, String pesel) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
	}

	public Osoba() {
		// TODO Auto-generated constructor stub
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel 
				+ ", stanowisko=" + stanowisko
				+ ", firma=" + firma + ", pensja=" + pensja + "]";
	}

	public static class OsobaFactory {
		public static Osoba stworzPracownika(String imie, String nazwisko, String pesel, String stanowisko,
				String firma, int pensja) {
			return new Osoba(imie, nazwisko, pesel, stanowisko, firma, pensja);
		}
		
		public static Osoba stworzBezdomnego(String imie, String nazwisko){
			return new Osoba(imie, nazwisko);
		}
		
		public static Osoba stworzBezrobotnego(String imie, String nazwisko, String pesel){
			return new Osoba(imie, nazwisko, pesel);
		}
	}

	public String getData() {
		return "###Osoba imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel ;
	}

}
