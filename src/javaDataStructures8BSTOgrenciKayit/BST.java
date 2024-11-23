package javaDataStructures8BSTOgrenciKayit;

public class BST {

	Node root;

	public BST() {
		root = null;
	}

	Node newNode(String ad, String soyad, int no, int not) {
		root = new Node(ad, soyad, no, not);
		return root;

	}

	Node insert(Node root, String ad, String soyad, int no, int not) {
		if (root != null) {
			if (no < root.no) {
				root.left = insert(root.left, ad, soyad, no, not);
			} else {
				root.right = insert(root.right, ad, soyad, no, not);
			}
		} else {
			root = newNode(ad, soyad, no, not);
		}
		return root;
	}

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.ad + "\t" + root.soyad + "\t" + root.no + "\t" + root.not);
			inOrder(root.right);
		}
	}

	Node delete(Node root, int no) {
		Node t1, t2;
		if (root == null) {
			return null;
		}
		if (root.no == no) {
			if (root.left == root.right) {
				root = null;
				return null;
			} else if (root.left == null) {
				t1 = root.right;
				return t1;
			} else if (root.right == null) {
				t1 = root.left;
				return t1;
			} else {
				t1 = t2 = root.right;
				while (t1.left != null) {
					t1 = t1.left;
				}
				t1.left = root.left;
				return t2;
			}
		} else {
			if (no < root.no) {
				root.left = delete(root.left, no);
			} else {
				root.right = delete(root.right, no);
			}
		}
		return root;
	}
}
