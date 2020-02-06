/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public abstract class Arac implements IArac {
	
	protected int aracID;
	protected String marka;
	protected String yakitTuru;
	protected int aracHizi;
	protected int yolcuSayisi;
	protected int tekerlekSayisi;
	protected int fiyat;
	protected int uretimYili;
	protected String aracRengi;
	
	protected Arac() {
	}
	
	protected Arac(int aracID, String marka, String yakitTuru, int aracHizi, int yolcuSayisi, int tekerlekSayisi, int fiyat, int uretimYili, String aracRengi) {
		
		this.aracID = aracID;
		this.marka = marka;
		this.yakitTuru = yakitTuru;
		this.aracHizi = aracHizi;
		this.yolcuSayisi = yolcuSayisi;
		this.tekerlekSayisi = tekerlekSayisi;
		this.fiyat = fiyat;
		this.uretimYili = uretimYili;
		this.aracRengi = aracRengi;

	}
	
	public abstract String printInfo();
	
	
}
