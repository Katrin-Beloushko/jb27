package by.cdp.jb27_les04.main;

public class asc_descArray {
public static void main (String[] args) {
	int[] ar= {0,5,8,1,14,20,21};
	int ind=Array(ar);
	printResult(ind);
}
public static int Array(int[] ar) {
	int ind=0;
	for (int i=0; i<ar.length-1; i++) {
		for (int j=i+1; j<ar.length; j++) {
			if (ar[i]>ar[j]) {
				ind++;
			}
		}
	}
 return ind;
}

public static void printResult(int ind) {
	if (ind>0) {
		System.out.println("Sequence is NOT sorted ascending");
	}
	else {
		System.out.println("Sequence is sorted ascending");
	}
}
}
