package inheritance;

public class Pracownik {

	private String stanowisko;
	private int pensja;

	private Osoba osoba;

	public Pracownik(String imie, String nazwisko, String stanowisko, int pensja) {
		this.stanowisko = stanowisko;
		this.pensja = pensja;
		this.osoba = new Osoba(imie, nazwisko);
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

	public String getNazwisko() {
		return osoba.getNazwisko();
	}

	public String getImie() {
		return osoba.getImie();
	}

	public void setNazwisko(String nazwisko) {
		this.osoba.setNazwisko(nazwisko);
	}

	public void setImie(String imie) {
		this.osoba.setImie(imie);
	}

}
