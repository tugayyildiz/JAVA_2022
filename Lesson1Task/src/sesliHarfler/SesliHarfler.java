package sesliHarfler;

public class SesliHarfler {

	public static void main(String[] args) {
		
		char harf= 'E';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli");
				break;
			default:
				System.out.println("İnce Sesli");
		}
	}

}
