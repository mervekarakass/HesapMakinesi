package HesapMakinesi;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int n1,n2,select;
		
		Scanner input = new Scanner (System.in);
		System.out.print("birinci sayiyi giriniz: ");
		n1 = input.nextInt();
		System.out.print("ikinci sayiyi giriniz: ");
		n2 = input.nextInt();
		
		System.out.println("1-toplama\n2-cikarma\n3-carpma\n4-bolme");
		System.out.print("seciminiz: ");
		select = input.nextInt();
		
		if (select == 1) {
			System.out.println("toplam : " + (n1+n2));
		} else if (select == 2) {
			System.out.println("cikarma: " + (n1 - n2));
		} else if (select == 3) {
			System.out.println("carpma: " + (n1 * n2));
			
		}
		
	}

}
