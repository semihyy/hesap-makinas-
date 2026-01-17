package deneme1;

import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("bir sayı gir: ");
	 int sayi = scan.nextInt();
	 
	 int faktoriyel = 1;
	 
	 for (int i = 1; i <= sayi; i++) {
		 faktoriyel *= i;
	 }

	 
	 System.out.println(sayi + "! = " + faktoriyel);
	 
	}

}
