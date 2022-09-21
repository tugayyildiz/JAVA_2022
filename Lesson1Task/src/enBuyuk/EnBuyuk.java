package enBuyuk;

public class EnBuyuk {

	public static void main(String[] args) {
		
		
		int sayi1 = 95;
		int sayi2 = 84;
		int sayi3 = 99;
		
		int enBuyuk = sayi1;
		
		if(sayi2 > sayi1 && sayi2 > sayi3) {
			enBuyuk=sayi2;
		}
		if(sayi3 > sayi1 && sayi3 > sayi1) {
			enBuyuk=sayi3;
		}
		
		System.out.println("EN BÜYÜK SAYI :" + enBuyuk);

	}

}
