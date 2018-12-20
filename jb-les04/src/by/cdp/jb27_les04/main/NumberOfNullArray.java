package by.cdp.jb27_les04.main;

public class NumberOfNullArray {
	public static void main (String[] args) {
		int[] ar={0,7,0,5,0,-6,0,4};
		int k=qtyOfNull(ar);
		nullPositionArray(ar,k);
	}
	
	
	public static int qtyOfNull(int[] ar) {
		int n=ar.length;
		int k=0;
		for (int i=0; i<n; i++) {
			if (ar[i]==0) {
				k++;
				
			}
		}
		return k;
	}
	
	public static void nullPositionArray(int[] ar, int k) {
		System.out.println("Array of null values positions: ");
		int[] b=new int[k];
		int i=0; int j=0;
		
		while (i<k && j<ar.length) {
			
			if (ar[j]==0) {
					        b[i]=j;
					        System.out.print(+b[i]+"; ");
				            i++;
				            j++;
				          }
				else {
					   j++;
				     }
			}
	}
	
}
