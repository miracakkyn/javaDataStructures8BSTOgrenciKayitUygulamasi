package javaDataStructures8BSTOgrenciKayit;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		BST ogr=new BST();
		/*ogr.root=ogr.insert(ogr.root, "Miraç", "Akkoyun", 212245, 100);
		ogr.root=ogr.insert(ogr.root, "Miraç3", "Akkoyun3", 25425, 1020);

		ogr.root=ogr.insert(ogr.root, "Miraç2", "Akkoyun2", 2258, 154);
		ogr.root=ogr.insert(ogr.root, "Miraç", "Akkoyun", 22512441, 10);

		ogr.inOrder(ogr.root);//in order küçükten büyüğe sıralar
		ogr.delete(ogr.root, 2258);
		ogr.inOrder(ogr.root);*/
		
		
		int secim=-1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Öğrenci Kayıt Uygulamasına Hoşgeldiniz\n__________________________________________");
		while(secim!=0) {
			System.out.println("1-Ekle");
			System.out.println("2-Sil");
			System.out.println("3-Yazdır");
			System.out.println("0-Çıkış");
			System.out.print("Seçiminiz : ");secim=scanner.nextInt();
			if(secim==1) {
				System.out.println("Sırasıyla öğrenci adı , soyadı  , numarası ve notunu giriniz");
				System.out.print("Ad:");String ad=scanner.next();System.out.println();
				System.out.print("Soyad:");String soyad=scanner.next();System.out.println();
				System.out.print("Numara:");int no=scanner.nextInt();System.out.println();
				System.out.print("Not:");int not=scanner.nextInt();System.out.println();
				ogr.root=ogr.insert(ogr.root, ad, soyad, no, not);
				System.out.println(no+" numaralı öğrenci eklendi...");

			}else if(secim==2) {
				System.out.print("Silmek istediğiniz öğrenci no giriniz:");int number=scanner.nextInt();
				ogr.root=ogr.delete(ogr.root, number);
				System.out.println(number+" numaralı öğrenci silindi...");
			}else if(secim==3) {
				ogr.inOrder(ogr.root);
			}else if(secim==0) {
				System.out.println("İyi Günler!");
			}else {
				System.out.println("Hatalı Seçim lütfen tekrar giriniz");
			}

		}

	}

}
