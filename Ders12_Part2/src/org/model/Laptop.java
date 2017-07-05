package org.model;

public class Laptop extends Bilgisayar{

	private String boyut;
	private String renk;
	private boolean dokunmatik=true;;
	private String kameraTipi;
	
	public String getBoyut() {
		return boyut;
	}
	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public boolean isDokunmatik() {
		return dokunmatik;
	}
	public void setDokunmatik(boolean dokunmatik) {
		this.dokunmatik = dokunmatik;
	}
	public String getKameraTipi() {
		return kameraTipi;
	}
	public void setKameraTipi(String kameraTipi) {
		this.kameraTipi = kameraTipi;
	}
	
}
