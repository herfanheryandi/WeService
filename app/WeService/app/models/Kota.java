package models;

public class Kota{
	public String nama;
	public String lintang;
	public String bujur;
	public String cuaca;
	public String suhuMax;
	public String suhuMin;
	
	public Kota(String nama, String lintang, String bujur, String cuaca, String suhuMax, String suhuMin){
		this.nama = nama;
		this.lintang = lintang;
		this.bujur = bujur;
		this.cuaca = cuaca;
		this.suhuMax = suhuMax;
		this.suhuMin = suhuMin;	
	}
}