package giseuyg;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("GİŞE UYGULAMASINA HOŞGELDİNİZ");
		System.out.print("LütfenTC kimlik numaranızı giriniz:");
		
		String tckn=input.nextLine();
		
		TCKN tcknNesne=new TCKN();
		tcknNesne.setTckn(tckn);
		
		

	}

}
