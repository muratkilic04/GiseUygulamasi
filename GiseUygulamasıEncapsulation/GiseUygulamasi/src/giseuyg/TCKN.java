package giseuyg;

import java.util.Random;

public class TCKN {
	
	private int id;
	
	private String tckn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTckn() {
		return tckn;
	}
     
	boolean kontrol=true;
	public void setTckn(String tckn) {
		
		if(tckn.length()==11) {
			for(int i=0;i<tckn.length();i++) {
				char karakter=tckn.charAt(i);
				if(Character.isDigit(karakter)) {
					kontrol=true;
				}else {
					kontrol=false;
					break;
				}
			}
			if(kontrol) {
				Random random=new Random();
				this.tckn = tckn;
				int giseNo=random.nextInt(100);
				sonucuYazdir("Gişe Numaranız:"+giseNo);
			}else {
				sonucuYazdir("Lütfen sadece rakam giriniz.");
			}
		}else {
			sonucuYazdir("TC kimlik numarası 11 karakter olmak zorundadır.");
		}
		
	}
	
	public void sonucuYazdir(String sonuc) {
		System.out.println(sonuc);
	}

}
