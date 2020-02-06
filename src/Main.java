/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		File otomobilAnahtar = new File("OtomobilAnahtar.txt");
		if(!otomobilAnahtar.exists()) {
			System.out.println("Otomobil ID'lerini tutan veritabanınız bulunmamaktadır. Yeni bir veritabanı oluşturuluyor.");
			otomobilAnahtar.createNewFile();
			PrintWriter wr = new PrintWriter(new FileWriter("OtomobilAnahtar.txt"), false);
			wr.print("10000");
			wr.close();
		}
		Scanner otomobilScanner = new Scanner(otomobilAnahtar);
		int baseOtomobilID = Integer.parseInt(otomobilScanner.next());

		File bisikletAnahtar = new File("BisikletAnahtar.txt");
		if(!bisikletAnahtar.exists()) {
			System.out.println("Bisiklet ID'lerini tutan veritabanınız bulunmamaktadır. Yeni bir veritabanı oluşturuluyor.");
			bisikletAnahtar.createNewFile();
			PrintWriter wr = new PrintWriter(new FileWriter("BisikletAnahtar.txt"), false);
			wr.print("20000");
			wr.close();
		}
		Scanner bisikletScanner = new Scanner(bisikletAnahtar);
		int baseBisikletID = Integer.parseInt(bisikletScanner.next());

		File gemiAnahtar = new File("GemiAnahtar.txt");
		if(!gemiAnahtar.exists()) {
			System.out.println("Gemi ID'lerini tutan veritabanınız bulunmamaktadır. Yeni bir veritabanı oluşturuluyor.");
			gemiAnahtar.createNewFile();
			PrintWriter wr = new PrintWriter(new FileWriter("GemiAnahtar.txt"), false);
			wr.print("30000");
			wr.close();
		}
		Scanner gemiScanner = new Scanner(gemiAnahtar);
		int baseGemiID = Integer.parseInt(gemiScanner.next());

		File ucakAnahtar = new File("UcakAnahtar.txt");
		if(!ucakAnahtar.exists()) {
			System.out.println("Uçak ID'lerini tutan veritabanınız bulunmamaktadır. Yeni bir veritabanı oluşturuluyor.");
			ucakAnahtar.createNewFile();
			PrintWriter wr = new PrintWriter(new FileWriter("UcakAnahtar.txt"), false);
			wr.print("40000");
			wr.close();
		}
		Scanner ucakScanner = new Scanner(ucakAnahtar);
		int baseUcakID = Integer.parseInt(ucakScanner.next());

		File ucanGemiAnahtar = new File("UcanGemiAnahtar.txt");
		if(!ucanGemiAnahtar.exists()) {
			System.out.println("Uçan Gemi ID'lerini tutan veritabanınız bulunmamaktadır. Yeni bir veritabanı oluşturuluyor.");
			ucanGemiAnahtar.createNewFile();
			PrintWriter wr = new PrintWriter(new FileWriter("UcanGemiAnahtar.txt"), false);
			wr.print("50000");
			wr.close();
		}
		Scanner ucanGemiScanner = new Scanner(ucanGemiAnahtar);
		int baseUcanGemiID = Integer.parseInt(ucanGemiScanner.next());

		boolean menuBaslat = true;
		ArrayList<Otomobil> otomobilList = new ArrayList<Otomobil>();
		ArrayList<Bisiklet> bisikletList = new ArrayList<Bisiklet>();
		ArrayList<Gemi> gemiList = new ArrayList<Gemi>();
		ArrayList<Ucak> ucakList = new ArrayList<Ucak>();
		ArrayList<UcanGemi> ucangemiList = new ArrayList<UcanGemi>();
		Scanner input = new Scanner(System.in);

		while(menuBaslat) {
			System.out.println("\nYapmak istediğiniz işlemi seçiniz:\n1. Veri girişinde bulun\n2. Veri listele\n3. Veri güncelle\n4. Çıkış");
			System.out.print("Seçeneğiniz: ");
			String secenek = input.next();
			while(!secenek.equals("1") && !secenek.equals("2") && !secenek.equals("3") && !secenek.equals("4")) {
				System.out.print("Lütfen ekrana yapmak istediğiniz işlem numarasını giriniz: ");
				secenek = input.next();
			}
			switch(secenek) {
			case "1" :
				System.out.println("\nVeri girişinde bulunacağınız aracı seçiniz:");
				System.out.println("1. Otomobil\n2. Bisiklet\n3. Gemi\n4. Uçak\n5. Uçan Gemi\n6. Bir öncek menüye geri dön\n7. Çıkış");
				System.out.print("Seçeneğiniz: ");
				String aracSecenek = input.next();
				while(!aracSecenek.equals("1") && !aracSecenek.equals("2") && !aracSecenek.equals("3") && !aracSecenek.equals("4") && !aracSecenek.equals("5") && !aracSecenek.equals("6") && !aracSecenek.equals("7")) {
					System.out.print("Lütfen ekrana yapmak istediğiniz işlem numarasını giriniz: ");
					aracSecenek = input.next();
				}
				switch(aracSecenek) {
				case "1" :
					System.out.print("\nLütfen aracın markasını giriniz: ");
					String marka = input.next();
					System.out.print("Lütfen aracın yakıt türünü giriniz: ");
					String yakitTuru = input.next();
					System.out.print("Lütfen aracın hızını giriniz: ");
					int aracHizi = input.nextInt();
					System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
					int yolcuSayisi = input.nextInt();
					System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
					int tekerlekSayisi = input.nextInt();
					System.out.print("Lütfen aracın fiyatını giriniz: ");
					int fiyat = input.nextInt();
					System.out.print("Lütfen aracın üretim yılını giriniz: ");
					int uretimYili = input.nextInt();
					System.out.print("Lütfen aracın rengini giriniz: ");
					String aracRengi = input.next();

					int otoID = baseOtomobilID;
					baseOtomobilID++;
					PrintWriter wr = new PrintWriter(new FileWriter("OtomobilAnahtar.txt", false));
					wr.print(baseOtomobilID);
					wr.close();

					PrintWriter writer = new PrintWriter(new FileWriter("AracKayit.txt", true));				

					Arac otomobil1 = new Otomobil(otoID, marka, yakitTuru, aracHizi, yolcuSayisi, tekerlekSayisi, fiyat, uretimYili, aracRengi);
					otomobilList.add((Otomobil) otomobil1);

					writer.println(otomobil1.printInfo());
					writer.close();
					System.out.println(otomobil1.printInfo());
					System.out.println();
					break;
				case "2" :
					System.out.print("\nLütfen aracın markasını giriniz: ");
					String marka2 = input.next();
					System.out.print("Lütfen aracın yakıt türünü giriniz: ");
					String yakitTuru2 = input.next();
					System.out.print("Lütfen aracın hızını giriniz: ");
					int aracHizi2 = input.nextInt();
					System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
					int yolcuSayisi2 = input.nextInt();
					System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
					int tekerlekSayisi2 = input.nextInt();
					System.out.print("Lütfen aracın fiyatını giriniz: ");
					int fiyat2 = input.nextInt();
					System.out.print("Lütfen aracın üretim yılını giriniz: ");
					int uretimYili2 = input.nextInt();
					System.out.print("Lütfen aracın rengini giriniz: ");
					String aracRengi2 = input.next();

					int bisikletID = baseBisikletID;
					baseBisikletID++;
					PrintWriter wr2 = new PrintWriter(new FileWriter("BisikletAnahtar.txt", false));
					wr2.print(baseBisikletID);
					wr2.close();

					PrintWriter writer2 = new PrintWriter(new FileWriter("AracKayit.txt", true));				

					Arac bisiklet1 = new Bisiklet(bisikletID, marka2, yakitTuru2, aracHizi2, yolcuSayisi2, tekerlekSayisi2, fiyat2, uretimYili2, aracRengi2);
					bisikletList.add((Bisiklet) bisiklet1);

					writer2.println(bisiklet1.printInfo());
					writer2.close();
					System.out.println(bisiklet1.printInfo());
					System.out.println();
					break;

				case "3" :
					System.out.print("\nLütfen aracın markasını giriniz: ");
					String marka3 = input.next();
					System.out.print("Lütfen aracın yakıt türünü giriniz: ");
					String yakitTuru3 = input.next();
					System.out.print("Lütfen aracın hızını giriniz: ");
					int aracHizi3 = input.nextInt();
					System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
					int yolcuSayisi3 = input.nextInt();
					System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
					int tekerlekSayisi3 = input.nextInt();
					System.out.print("Lütfen aracın fiyatını giriniz: ");
					int fiyat3 = input.nextInt();
					System.out.print("Lütfen aracın üretim yılını giriniz: ");
					int uretimYili3 = input.nextInt();
					System.out.print("Lütfen aracın rengini giriniz: ");
					String aracRengi3 = input.next();

					int gemiID = baseGemiID;
					baseGemiID++;
					PrintWriter wr3 = new PrintWriter(new FileWriter("GemiAnahtar.txt", false));
					wr3.print(baseGemiID);
					wr3.close();

					PrintWriter writer3 = new PrintWriter(new FileWriter("AracKayit.txt", true));				

					IArac gemi1 = new Gemi(gemiID, marka3, yakitTuru3, aracHizi3, yolcuSayisi3, tekerlekSayisi3, fiyat3, uretimYili3, aracRengi3);
					gemiList.add((Gemi) gemi1);

					writer3.println(gemi1.printInfo());
					writer3.close();
					System.out.println(gemi1.printInfo());
					System.out.println();
					break;

				case "4" :
					System.out.print("\nLütfen aracın markasını giriniz: ");
					String marka4 = input.next();
					System.out.print("Lütfen aracın yakıt türünü giriniz: ");
					String yakitTuru4 = input.next();
					System.out.print("Lütfen aracın hızını giriniz: ");
					int aracHizi4 = input.nextInt();
					System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
					int yolcuSayisi4 = input.nextInt();
					System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
					int tekerlekSayisi4 = input.nextInt();
					System.out.print("Lütfen aracın fiyatını giriniz: ");
					int fiyat4 = input.nextInt();
					System.out.print("Lütfen aracın üretim yılını giriniz: ");
					int uretimYili4 = input.nextInt();
					System.out.print("Lütfen aracın rengini giriniz: ");
					String aracRengi4 = input.next();

					int ucakID = baseUcakID;
					baseUcakID++;
					PrintWriter wr4 = new PrintWriter(new FileWriter("UcakAnahtar.txt", false));
					wr4.print(baseUcakID);
					wr4.close();

					PrintWriter writer4 = new PrintWriter(new FileWriter("AracKayit.txt", true));				

					IArac ucak1 = new Ucak(ucakID, marka4, yakitTuru4, aracHizi4, yolcuSayisi4, tekerlekSayisi4, fiyat4, uretimYili4, aracRengi4);
					ucakList.add((Ucak) ucak1);

					writer4.println(ucak1.printInfo());
					writer4.close();
					System.out.println(ucak1.printInfo());
					System.out.println();
					break;

				case "5" :
					System.out.print("\nLütfen aracın markasını giriniz: ");
					String marka5 = input.next();
					System.out.print("Lütfen aracın yakıt türünü giriniz: ");
					String yakitTuru5 = input.next();
					System.out.print("Lütfen aracın hızını giriniz: ");
					int aracHizi5 = input.nextInt();
					System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
					int yolcuSayisi5 = input.nextInt();
					System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
					int tekerlekSayisi5 = input.nextInt();
					System.out.print("Lütfen aracın fiyatını giriniz: ");
					int fiyat5 = input.nextInt();
					System.out.print("Lütfen aracın üretim yılını giriniz: ");
					int uretimYili5 = input.nextInt();
					System.out.print("Lütfen aracın rengini giriniz: ");
					String aracRengi5 = input.next();

					int ucanGemiID = baseUcanGemiID;
					baseUcanGemiID++;
					PrintWriter wr5 = new PrintWriter(new FileWriter("UcanGemiAnahtar.txt", false));
					wr5.print(baseUcanGemiID);
					wr5.close();

					PrintWriter writer5 = new PrintWriter(new FileWriter("AracKayit.txt", true));				

					IArac ucanGemi1 = new UcanGemi(ucanGemiID, marka5, yakitTuru5, aracHizi5, yolcuSayisi5, tekerlekSayisi5, fiyat5, uretimYili5, aracRengi5);
					ucangemiList.add((UcanGemi) ucanGemi1);

					writer5.println(ucanGemi1.printInfo());
					writer5.close();
					System.out.println(ucanGemi1.printInfo());
					System.out.println();
					break;

				case "6" :
					break;

				case "7" :
					menuBaslat = false;
				}
				break;
			case "2" :
				System.out.println("\nListelemek istediğiniz veri tipini seçiniz:");
				System.out.println("1. Kara Taşıtları\n2. Deniz Taşıtları\n3. Hava Taşıtları\n4. Bir öncek menüye geri dön\n5. Çıkış");
				System.out.print("Seçeneğiniz: ");
				String listeSecenek = input.next();
				while(!listeSecenek.equals("1") && !listeSecenek.equals("2") && !listeSecenek.equals("3") && !listeSecenek.equals("4") && !listeSecenek.equals("5")) {
					System.out.print("Lütfen ekrana yapmak istediğiniz işlem numarasını giriniz: ");
					listeSecenek = input.next();
				}
				File listeFile = new File("AracKayit.txt");
				Scanner inputListe = new Scanner(listeFile);
				switch(listeSecenek) {
				case "1" :
					while(inputListe.hasNextLine()) {
						String karaTasitlariLine = inputListe.nextLine();
						if(karaTasitlariLine.charAt(4) == '1' || karaTasitlariLine.charAt(4) == '2') {
							System.out.println(karaTasitlariLine);
						}
					}
				case "2" :
					while(inputListe.hasNextLine()) {
						String denizTasitlariLine = inputListe.nextLine();
						if(denizTasitlariLine.charAt(4) == '3' || denizTasitlariLine.charAt(4) == '5') {
							System.out.println(denizTasitlariLine);
						}
					}					
				case "3" :
					while(inputListe.hasNextLine()) {
						String havaTasitlariLine = inputListe.nextLine();
						if(havaTasitlariLine.charAt(4) == '4' || havaTasitlariLine.charAt(4) == '5') {
							System.out.println(havaTasitlariLine);
						}
					}				
				case "4" :
					break;
				case "5" :
					menuBaslat = false;
				}
				break;
			case "3" :
				System.out.println("\nGüncellemek istediğiniz veri tipini seçiniz:");
				System.out.println("1. Kara Taşıtları\n2. Deniz Taşıtları\n3. Hava Taşıtları\n4. Bir öncek menüye geri dön\n5. Çıkış");
				System.out.print("Seçeneğiniz: ");
				String veriTipi = input.next();
				while(!veriTipi.equals("1") && !veriTipi.equals("2") && !veriTipi.equals("3") && !veriTipi.equals("4") && !veriTipi.equals("5")) {
					System.out.print("Lütfen ekrana yapmak istediğiniz işlem numarasını giriniz: ");
					veriTipi = input.next();
				}
				switch(veriTipi) {
				case "1" :
					System.out.println("Güncellemek istediğiniz araç tipini seçiniz: ");
					System.out.println("1. Otomobil\n2. Bisiklet");
					System.out.print("Seçeneğiniz: ");
					String aracTipi = input.next();
					while(!aracTipi.equals("1") && !aracTipi.equals("2")) {
						System.out.print("Lütfen ekrana yapmak istediğiniz işlem numarasını giriniz: ");
						aracTipi = input.next();
					}
					switch(aracTipi) {
					case "1" :
						System.out.print("Güncellemek istediğiniz aracın ID'sini giriniz: ");
						ArrayList <String> temp = new ArrayList<String>();
						String idGuncelle = input.next();
						File file = new File("AracKayit.txt");
						Scanner inputListe2 = new Scanner(file);
						while(inputListe2.hasNextLine()) {
							String line = inputListe2.nextLine();
							if(line.contains(idGuncelle)) {
								continue;
							}
							line = line.trim();
							temp.add(line);
						}
						PrintWriter wr = new PrintWriter(new FileWriter("AracKayit.txt"), false);
						wr.println();
						wr.close();

						PrintWriter writer = new PrintWriter(new FileWriter("AracKayit.txt"), true);
						for(int i = 0; i < temp.size(); i++) {
							writer.println(temp.get(i));
						}

						System.out.print("\nLütfen aracın markasını giriniz: ");
						String marka = input.next();
						System.out.print("Lütfen aracın yakıt türünü giriniz: ");
						String yakitTuru = input.next();
						System.out.print("Lütfen aracın hızını giriniz: ");
						int aracHizi = input.nextInt();
						System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
						int yolcuSayisi = input.nextInt();
						System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
						int tekerlekSayisi = input.nextInt();
						System.out.print("Lütfen aracın fiyatını giriniz: ");
						int fiyat = input.nextInt();
						System.out.print("Lütfen aracın üretim yılını giriniz: ");
						int uretimYili = input.nextInt();
						System.out.print("Lütfen aracın rengini giriniz: ");
						String aracRengi = input.next();								

						Arac otomobil1 = new Otomobil(Integer.parseInt(idGuncelle), marka, yakitTuru, aracHizi, yolcuSayisi, tekerlekSayisi, fiyat, uretimYili, aracRengi);
						otomobilList.add((Otomobil) otomobil1);

						writer.println(otomobil1.printInfo());
						writer.close();
						System.out.println(otomobil1.printInfo());
						System.out.println();
						break;
					case "2" :
						System.out.print("Güncellemek istediğiniz aracın ID'sini giriniz: ");
						ArrayList <String> temp2 = new ArrayList<String>();
						String idGuncelle2 = input.next();
						File file2 = new File("AracKayit.txt");
						Scanner inputListe3 = new Scanner(file2);
						while(inputListe3.hasNextLine()) {
							String line = inputListe3.nextLine();
							if(line.contains(idGuncelle2)) {
								continue;
							}
							line = line.trim();
							temp2.add(line);
						}
						PrintWriter wr2 = new PrintWriter(new FileWriter("AracKayit.txt"), false);
						wr2.println();
						wr2.close();

						PrintWriter writer2 = new PrintWriter(new FileWriter("AracKayit.txt"), true);
						for(int i = 0; i < temp2.size(); i++) {
							writer2.println(temp2.get(i));
						}

						System.out.print("\nLütfen aracın markasını giriniz: ");
						String marka2 = input.next();
						System.out.print("Lütfen aracın yakıt türünü giriniz: ");
						String yakitTuru2 = input.next();
						System.out.print("Lütfen aracın hızını giriniz: ");
						int aracHizi2 = input.nextInt();
						System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
						int yolcuSayisi2 = input.nextInt();
						System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
						int tekerlekSayisi2 = input.nextInt();
						System.out.print("Lütfen aracın fiyatını giriniz: ");
						int fiyat2 = input.nextInt();
						System.out.print("Lütfen aracın üretim yılını giriniz: ");
						int uretimYili2 = input.nextInt();
						System.out.print("Lütfen aracın rengini giriniz: ");
						String aracRengi2 = input.next();								

						Arac bisiklet1 = new Bisiklet(Integer.parseInt(idGuncelle2), marka2, yakitTuru2, aracHizi2, yolcuSayisi2, tekerlekSayisi2, fiyat2, uretimYili2, aracRengi2);
						bisikletList.add((Bisiklet) bisiklet1);

						writer2.println(bisiklet1.printInfo());
						writer2.close();
						System.out.println(bisiklet1.printInfo());
						System.out.println();
						break;
					}
					break;
				case "2" :
					System.out.println("Güncellemek istediğiniz araç tipini seçiniz: ");
					System.out.println("1. Gemi\n2. Uçan Gemi");
					System.out.print("Seçeneğiniz: ");
					String aracTipi2 = input.next();
					while(!aracTipi2.equals("1") && !aracTipi2.equals("2")) {
						System.out.print("Lütfen ekrana yapmak istediğiniz işlem numarasını giriniz: ");
						aracTipi2 = input.next();
					}
					switch(aracTipi2) {
					case "1" :
						System.out.print("Güncellemek istediğiniz aracın ID'sini giriniz: ");
						ArrayList <String> temp = new ArrayList<String>();
						String idGuncelle = input.next();
						File file = new File("AracKayit.txt");
						Scanner inputListe2 = new Scanner(file);
						while(inputListe2.hasNextLine()) {
							String line = inputListe2.nextLine();
							if(line.contains(idGuncelle)) {
								continue;
							}
							line = line.trim();
							temp.add(line);
						}
						PrintWriter wr = new PrintWriter(new FileWriter("AracKayit.txt"), false);
						wr.println();
						wr.close();

						PrintWriter writer = new PrintWriter(new FileWriter("AracKayit.txt"), true);
						for(int i = 0; i < temp.size(); i++) {
							writer.println(temp.get(i));
						}
						
						System.out.print("\nLütfen aracın markasını giriniz: ");
						String marka = input.next();
						System.out.print("Lütfen aracın yakıt türünü giriniz: ");
						String yakitTuru = input.next();
						System.out.print("Lütfen aracın hızını giriniz: ");
						int aracHizi = input.nextInt();
						System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
						int yolcuSayisi = input.nextInt();
						System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
						int tekerlekSayisi = input.nextInt();
						System.out.print("Lütfen aracın fiyatını giriniz: ");
						int fiyat = input.nextInt();
						System.out.print("Lütfen aracın üretim yılını giriniz: ");
						int uretimYili = input.nextInt();
						System.out.print("Lütfen aracın rengini giriniz: ");
						String aracRengi = input.next();								

						IArac gemi1 = new Gemi(Integer.parseInt(idGuncelle), marka, yakitTuru, aracHizi, yolcuSayisi, tekerlekSayisi, fiyat, uretimYili, aracRengi);
						gemiList.add((Gemi) gemi1);

						writer.println(gemi1.printInfo());
						writer.close();
						System.out.println(gemi1.printInfo());
						System.out.println();
						break;
					case "2" :
						System.out.print("Güncellemek istediğiniz aracın ID'sini giriniz: ");
						ArrayList <String> temp2 = new ArrayList<String>();
						String idGuncelle2 = input.next();
						File file2 = new File("AracKayit.txt");
						Scanner inputListe3 = new Scanner(file2);
						while(inputListe3.hasNextLine()) {
							String line = inputListe3.nextLine();
							if(line.contains(idGuncelle2)) {
								continue;
							}
							line = line.trim();
							temp2.add(line);
						}
						PrintWriter wr2 = new PrintWriter(new FileWriter("AracKayit.txt"), false);
						wr2.println();
						wr2.close();

						PrintWriter writer2 = new PrintWriter(new FileWriter("AracKayit.txt"), true);
						for(int i = 0; i < temp2.size(); i++) {
							writer2.println(temp2.get(i));
						}

						System.out.print("\nLütfen aracın markasını giriniz: ");
						String marka2 = input.next();
						System.out.print("Lütfen aracın yakıt türünü giriniz: ");
						String yakitTuru2 = input.next();
						System.out.print("Lütfen aracın hızını giriniz: ");
						int aracHizi2 = input.nextInt();
						System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
						int yolcuSayisi2 = input.nextInt();
						System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
						int tekerlekSayisi2 = input.nextInt();
						System.out.print("Lütfen aracın fiyatını giriniz: ");
						int fiyat2 = input.nextInt();
						System.out.print("Lütfen aracın üretim yılını giriniz: ");
						int uretimYili2 = input.nextInt();
						System.out.print("Lütfen aracın rengini giriniz: ");
						String aracRengi2 = input.next();								

						IArac ucanGemi1 = new UcanGemi(Integer.parseInt(idGuncelle2), marka2, yakitTuru2, aracHizi2, yolcuSayisi2, tekerlekSayisi2, fiyat2, uretimYili2, aracRengi2);
						ucangemiList.add((UcanGemi) ucanGemi1);

						writer2.println(ucanGemi1.printInfo());
						writer2.close();
						System.out.println(ucanGemi1.printInfo());
						System.out.println();
						break;
					}
					break;
				case "3" :
					System.out.println("Güncellemek istediğiniz araç tipini seçiniz: ");
					System.out.println("1. Uçak\n2. Uçan Gemi");
					System.out.print("Seçeneğiniz: ");
					String aracTipi3 = input.next();
					while(!aracTipi3.equals("1") && !aracTipi3.equals("2")) {
						System.out.print("Lütfen ekrana yapmak istediğiniz işlem numarasını giriniz: ");
						aracTipi3 = input.next();
					}
					switch(aracTipi3) {
					case "1":
						System.out.print("Güncellemek istediğiniz aracın ID'sini giriniz: ");
						ArrayList <String> temp = new ArrayList<String>();
						String idGuncelle = input.next();
						File file = new File("AracKayit.txt");
						Scanner inputListe2 = new Scanner(file);
						while(inputListe2.hasNextLine()) {
							String line = inputListe2.nextLine();
							if(line.contains(idGuncelle)) {
								continue;
							}
							line = line.trim();
							temp.add(line);
						}
						PrintWriter wr = new PrintWriter(new FileWriter("AracKayit.txt"), false);
						wr.println();
						wr.close();

						PrintWriter writer = new PrintWriter(new FileWriter("AracKayit.txt"), true);
						for(int i = 0; i < temp.size(); i++) {
							writer.println(temp.get(i));
						}
						
						System.out.print("\nLütfen aracın markasını giriniz: ");
						String marka = input.next();
						System.out.print("Lütfen aracın yakıt türünü giriniz: ");
						String yakitTuru = input.next();
						System.out.print("Lütfen aracın hızını giriniz: ");
						int aracHizi = input.nextInt();
						System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
						int yolcuSayisi = input.nextInt();
						System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
						int tekerlekSayisi = input.nextInt();
						System.out.print("Lütfen aracın fiyatını giriniz: ");
						int fiyat = input.nextInt();
						System.out.print("Lütfen aracın üretim yılını giriniz: ");
						int uretimYili = input.nextInt();
						System.out.print("Lütfen aracın rengini giriniz: ");
						String aracRengi = input.next();								

						IArac ucak1 = new Ucak(Integer.parseInt(idGuncelle), marka, yakitTuru, aracHizi, yolcuSayisi, tekerlekSayisi, fiyat, uretimYili, aracRengi);
						ucakList.add((Ucak) ucak1);

						writer.println(ucak1.printInfo());
						writer.close();
						System.out.println(ucak1.printInfo());
						System.out.println();
						break;
					case "2":
						System.out.print("Güncellemek istediğiniz aracın ID'sini giriniz: ");
						ArrayList <String> temp2 = new ArrayList<String>();
						String idGuncelle2 = input.next();
						File file2 = new File("AracKayit.txt");
						Scanner inputListe3 = new Scanner(file2);
						while(inputListe3.hasNextLine()) {
							String line = inputListe3.nextLine();
							if(line.contains(idGuncelle2)) {
								continue;
							}
							line = line.trim();
							temp2.add(line);
						}
						PrintWriter wr2 = new PrintWriter(new FileWriter("AracKayit.txt"), false);
						wr2.println();
						wr2.close();

						PrintWriter writer2 = new PrintWriter(new FileWriter("AracKayit.txt"), true);
						for(int i = 0; i < temp2.size(); i++) {
							writer2.println(temp2.get(i));
						}

						System.out.print("\nLütfen aracın markasını giriniz: ");
						String marka2 = input.next();
						System.out.print("Lütfen aracın yakıt türünü giriniz: ");
						String yakitTuru2 = input.next();
						System.out.print("Lütfen aracın hızını giriniz: ");
						int aracHizi2 = input.nextInt();
						System.out.print("Lütfen aracın yolcu sayısını giriniz: ");
						int yolcuSayisi2 = input.nextInt();
						System.out.print("Lütfen aracın tekerlek sayısını giriniz: ");
						int tekerlekSayisi2 = input.nextInt();
						System.out.print("Lütfen aracın fiyatını giriniz: ");
						int fiyat2 = input.nextInt();
						System.out.print("Lütfen aracın üretim yılını giriniz: ");
						int uretimYili2 = input.nextInt();
						System.out.print("Lütfen aracın rengini giriniz: ");
						String aracRengi2 = input.next();								

						IArac ucanGemi1 = new UcanGemi(Integer.parseInt(idGuncelle2), marka2, yakitTuru2, aracHizi2, yolcuSayisi2, tekerlekSayisi2, fiyat2, uretimYili2, aracRengi2);
						ucangemiList.add((UcanGemi) ucanGemi1);

						writer2.println(ucanGemi1.printInfo());
						writer2.close();
						System.out.println(ucanGemi1.printInfo());
						System.out.println();
						break;
					}
					break;
				case "4" :
					break;
				case "5" :
					menuBaslat = false;
				}
				break;
			case "4" :
				menuBaslat = false;
			}
		}
	}
}
