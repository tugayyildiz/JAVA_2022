package asalMi;

import java.util.Scanner;

public class AsalMi {

	public static void main(String[] args) {

			int sayi;
			boolean asalMi = true;
		
			Scanner scan = new Scanner(System.in);
			System.out.print("Sayı :");
			sayi = scan.nextInt();
 		
			if(sayi == 1) {
				asalMi=false;
			}
			else {
		
				for(int i = 2 ; i < sayi; i++) {
				
					if(sayi % i == 0) {
					
						asalMi=false;
					}
				}
			}
		

			if(asalMi == true) {
				System.out.println("ASAL");
			}
			else {
				System.out.println("ASAL DEĞİL");
			}
		
		}
		
		

}
