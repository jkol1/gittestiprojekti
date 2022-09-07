package hh.swd20.autoproject.domain;




public class Auto { // kaikki luokat periytyy object luokasta
	
	// attribuutit
	private String merkki;
	private int valmistuvuosi;
	
	// konstruktorit
	public Auto(String merkki, int valmistuvuosi) {
		super();
		this.merkki = merkki;
		this.valmistuvuosi = valmistuvuosi;
	}
	public Auto() {
		super();
		this.merkki = null;
		this.valmistuvuosi = 0;
	}
	// setterit ja getterit
	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	public void setValmistuvuosi(int valmistuvuosi) {
		this.valmistuvuosi = valmistuvuosi;
	}
	public String getMerkki() {
		return merkki;
	}
	public int getValmistuvuosi() {
		return valmistuvuosi;
	}
	
	// toString
	@Override
	public String toString() {
		return "Auto [merkki=" + merkki + ", valmistuvuosi=" + valmistuvuosi + "]";
	}
	
	
	
	
	
	

}
