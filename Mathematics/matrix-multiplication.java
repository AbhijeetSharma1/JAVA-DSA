public class Main
{
	public static void main(String[] args) {
		int [][] arr1 = {{1,2,3},{6,4,2},{7,1,9}};
		int [][] arr2 = {{1,2,8},{7,5,9},{6,4,2}};
		int [][] arr3 = matrixmultiply(arr1, arr2);
		printmatrix(arr3);
	}
	public static int [][] matrixmultiply(int [][] arr1, int [][] arr2){
	    int [][] arr3 = new int[3][3];
	    for(int i = 0; i < arr1.length ; i++){
	        int sum = 0;
	        for(int k = 0; k < arr1[0].length ; k++){
	            for(int j = 0; j< arr1[0].length; j++){
	                arr3[i][k] += arr1[i][j] * arr2[j][k];
	            }
	        }
	    }
	    return arr3;
	}
	public static void printmatrix(int [][] arr){
	    for(int [] ar : arr){
		    for(int i : ar){
		        System.out.print(i + " ");
		    }
		    System.out.println();
		}
	}
}
