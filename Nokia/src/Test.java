
public class Test {

	public static int solution(int[] A) {
		int n = A.length;
		int slices = 0;
		int slicesSumZero = 0;
		int slicesSum;
        if (slices > 1000000000) {
        	return -1;
        }
        for (int i = 0; i < n; i++) {
        	for (int k = i; k < n; k++){
        		if (i >= 0 && i <= k && i < n-1) {
            		slices++;
            		slicesSum = 0;
            		for (int o = i; o <= k; o++) {
            			slicesSum += A[o];
            		}
            		if (slicesSum == 0) {
            			System.out.println(i+","+k);
            			slicesSumZero++;
            		}
            	}
        	}
        }
        System.out.println(slices);
        return slicesSumZero;   
    }
	
	public static void main(String[] args) {
		int[] arr = {2,-2,3,0,4,-7};
		System.out.println(solution(arr));
	}

}
