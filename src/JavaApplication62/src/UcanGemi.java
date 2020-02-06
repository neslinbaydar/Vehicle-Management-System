/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class UcanGemi implements DenizTasitlari, HavaTasitlari{
	
	private int aracID;
	private String marka;
	private String yakitTuru;
	private int aracHizi;
	private int yolcuSayisi;
	private int tekerlekSayisi;
	private int fiyat;
	private int uretimYili;
	private String aracRengi;
	
	UcanGemi(){
	}
	
	public UcanGemi(int aracID, String marka, String yakitTuru, int aracHizi, int yolcuSayisi, int tekerlekSayisi, int fiyat, int uretimYili, String aracRengi) {
		
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

	public int getAracID() {
		return aracID;
	}

	public void setAracID(int aracID) {
		this.aracID = aracID;
	}
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getYakitTuru() {
		return yakitTuru;
	}

	public void setYakitTuru(String yakitTuru) {
		this.yakitTuru = yakitTuru;
	}

	public int getAracHizi() {
		return aracHizi;
	}

	public void setAracHizi(int aracHizi) {
		this.aracHizi = aracHizi;
	}

	public int getYolcuSayisi() {
		return yolcuSayisi;
	}

	public void setYolcuSayisi(int yolcuSayisi) {
		this.yolcuSayisi = yolcuSayisi;
	}
	
	public int getTekerlekSayisi() {
		return tekerlekSayisi;
	}

	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public int getUretimYili() {
		return uretimYili;
	}

	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}

	public String getAracRengi() {
		return aracRengi;
	}

	public void setAracRengi(String aracRengi) {
		this.aracRengi = aracRengi;
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
