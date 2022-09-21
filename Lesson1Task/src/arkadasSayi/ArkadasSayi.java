package arkadasSayi;

import java.util.Scanner;

public class ArkadasSayi {

	public static void main(String[] args) {
		
		
		int sayi1,sayi2;
		int toplamSayi1=0;
		int toplamSayi2=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1.Sayı :");
		sayi1 = scan.nextInt();
		System.out.print("2.Sayı :");
		sayi2 = scan.nextInt();
		
		toplamSayi1 = pozitifBolenToplamHesapla(sayi1); 
		toplamSayi2 = pozitifBolenToplamHesapla(sayi2);
		
		
		if(toplamSayi1 == sayi2 && toplamSayi2 == sayi1) {
			System.out.println("Arkadaş sayılar");
		}
		else {
			System.out.println("Arkadaş sayı değil");
		}
		
	}
	
	public static int pozitifBolenToplamHesapla(int sayi) {

		int toplam=0;
		
		for(int i=1 ; i < sayi; i++) {
			if(sayi % i == 0) {
				toplam += i;
			}
		}
		
		return toplam;
	}

}
