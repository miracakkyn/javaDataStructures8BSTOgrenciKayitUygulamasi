package javaDataStructures8BSTOgrenciKayit;

public class Node {
	String ad,soyad;
	int no,not;
	Node left;
	Node right;
	
	public Node() {
		this.ad = "";
		this.soyad = "";
		this.no = 0;
		this.not = 0;
		
	}

	public Node(String ad, String soyad, int no, int not) {
		this.ad = ad;
		this.soyad = soyad;
		this.no = no;
		this.not = not;
	}
	
}
