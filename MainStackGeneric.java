
public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		
		tumpuk.push("ASWANDI");tumpuk.cetak();
		tumpuk.push("Nadra");tumpuk.cetak();
		tumpuk.push("Rosalina");tumpuk.cetak();
		tumpuk.push("nilasari");tumpuk.cetak();
	
		tumpuk.pop();tumpuk.cetak();

	}

}
