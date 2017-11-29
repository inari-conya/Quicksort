package algorithms;

public class Quicksort {
	int[] A = { 2, 8, 7, 1, 3, 5, 6, 4 };
	
	public static void Qstest() {
		Quicksort tt = new Quicksort();
		Quicksort.QuickSort(tt.A, 0, tt.A.length-1);
		
		for(int i=0; i < tt.A.length; i++) {
			System.out.printf("%d ", tt.A[i]);
		}
	}
	
	private static void QuickSort(int[] A, int p, int r) {
		int q = 0;
		if(p < r) {
			q = Quicksort.Partition(A, p, r);
			Quicksort.QuickSort(A, p, q-1);
			Quicksort.QuickSort(A, q+1, r);
		}
	}
	
	private static int Partition(int[] A, int p, int r) {
		int i = p - 1;
		int tmp = 0;
		for (int j = p; j < r; j++) {
			if (A[j] <= A[r] && ++i != j) {
				tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		tmp = A[r];
		A[r] = A[++i];
		A[i] = tmp;
		return i;
	}
}
