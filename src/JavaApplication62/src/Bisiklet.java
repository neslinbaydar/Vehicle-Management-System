/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class Bisiklet extends KaraTasitlari {
	
	Bisiklet(){
		
	}
	Bisiklet(int aracID, String marka, String yakitTuru, int aracHizi, int yolcuSayisi, int tekerlekSayisi, int fiyat, int uretimYili, String aracRengi){
		super(aracID, marka, yakitTuru, aracHizi, yolcuSayisi, tekerlekSayisi, fiyat, uretimYili, aracRengi);
	}
	@Override
	public String printInfo() {
		return String.format("ID: %d   Marka: %s   Yakıt Türü: %s   Araç Hızı: %d   Yolcu Sayısı: %d   Tekerlek Sayısı: %d   Fiyat: %d   Üretim Yılı: %s   Araç Rengi: %s", aracID, marka, yakitTuru, aracHizi, yolcuSayisi, tekerlekSayisi, fiyat, uretimYili, aracRengi);
	}
         //ACTIONS
    public void increaseSpeed(double howHardPress) {
        aracHizi += howHardPress * aracHizi;
    }

    public void decreaseSpeed(double howHardPress) {
        aracHizi -= howHardPress * aracHizi;
    }

    public void stop(double howHardPress) {
        aracHizi = 0;
    }

}
