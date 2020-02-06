/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public interface DenizTasitlari extends IArac {
	
	public int getAracID();
	public String getMarka();
	public String getYakitTuru();
	public int getAracHizi();
	public int getYolcuSayisi();
	public int getTekerlekSayisi();
	public int getFiyat();
	public int getUretimYili();
	public String getAracRengi();
	
	public String printInfo();
	
}
