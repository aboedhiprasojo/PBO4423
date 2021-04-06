package Praktikum5;

public class Siswa {
	private String Nim;
	private String Nama;
	private String NilaiTeori;
	private String NilaiPraktik;

	// getter and setter method
	public String getNim() {return Nim;}
	public void setNim(String Nim) {this.Nim = Nim;}
	public String getNama() {return Nama;}
	public void setNama(String Nama) {this.Nama = Nama;}
	public int getNilaiTeori() {return NilaiTeori;}
	public void setNilaiTeori(int NilaiTeori) {this.NilaiTeori = NilaiTeori;}
	public int getNilaiPraktik() {return NilaiPraktik;}
	public void setNilaiPraktik(int NilaiPraktik) {this.NilaiPraktik = NilaiPraktik;}

	// default constructor
	public Siswa(){
		super();
	}

	// parameter constructor
	public Siswa(String Nim, String Nama, int NilaiTeori, int NilaiPraktik){
		super();
		this.Nim = Nim;
		this.Nama = Nama;
		this.NilaiTeori = NilaiTeori;
		this.NilaiPraktik = NilaiPraktik;
	}
}