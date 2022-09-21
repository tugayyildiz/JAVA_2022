package mukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		int sayi;
		int toplam = 0 ;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("SAYI :");
		sayi = scan.nextInt();

		for(int i=1 ; i <= sayi; i++) {
			if(sayi % i == 0) {
				toplam += i;
			}
		}
		//496 8128
		if((sayi * 2) == toplam) {
			System.out.println("Mükemmel Sayı");
		}
		
		else {
			System.out.println("Mükemmel sayı değil");
		}

	}

}
