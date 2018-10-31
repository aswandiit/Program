public class MainStackString {

	public static void main(String[] args) {
	StackString Nama  = new StackString();
	Nama.cetak();
	
	Nama.push("Aswandi");Nama.cetak();
	Nama.push("Muh. Alim");Nama.cetak();
	Nama.push("Ahmad Yamin");Nama.cetak();
	Nama.push("Eksa Arwinsyah");Nama.cetak();
	
	String keluar1 = Nama.pop();Nama.cetak();
	System.out.println(keluar1);
	
	String keluar2 = Nama.pop();Nama.cetak();
	System.out.println(keluar2);
	
	String keluar3 = Nama.pop();Nama.cetak();
	System.out.println(keluar3);
	
	String keluar4 = Nama.pop();Nama.cetak();
	System.out.println(keluar4);
	}

}
