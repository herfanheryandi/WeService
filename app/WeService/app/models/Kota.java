package models;

public class Kota{
	public String nama;
	public String lintang;
	public String bujur;
	public String cuaca;
	public String suhuMax;
	public String suhuMin;
	public String icon;
	
	public Kota(String nama, String lintang, String bujur, String cuaca, String suhuMax, String suhuMin){
		this.nama = nama;
		this.lintang = lintang;
		this.bujur = bujur;
		this.cuaca = cuaca;
		this.suhuMax = suhuMax;
		this.suhuMin = suhuMin;	
		setIcon();
	}
	
	public void setIcon(){
		if(cuaca.equals("Cerah"))
		{
			icon = "cerah";
		}
		else if(cuaca.equals("Cerah Berawan"))
		{
			icon = "cerah_berawan";
		}
		else if(cuaca.equals("Cerah Berawan"))
		{
			icon = "cerah_berawan";
		}
		else if(cuaca.equals("Berawan"))
		{
			icon = "berawan";
		}
		else if(cuaca.equals("Hujan Ringan"))
		{
			icon = "hujan_ringan";
		}
		else if(cuaca.equals("Hujan Sedang"))
		{
			icon = "hujan_sedang";
		}
		else if(cuaca.equals("Hujan Lebat"))
		{
			icon = "hujan_lebat";
		}
		else{
			icon = "default";	
		}
	}
	
}