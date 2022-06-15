import java.util.Scanner;
import java.util.HashSet;

class SetMatrixZeroes{


	public static void setMatrixZeroes(int matrix[][]){
		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> columns = new HashSet<>();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j] == 0){
					rows.add(i);
					columns.add(j);
				}
			}
		}
		for(Integer row: rows){
			for(int i=0;i<matrix[row].length;i++){
				matrix[row][i] = 0;
			}
		}
		System.out.println("done");
		for(Integer column: columns){
			for(int i=0;i<matrix.length;i++){
				matrix[i][column] = 0;
			}
		}
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no.of rows = ");
		int rows = sc.nextInt();
		System.out.print("enter no.of columns = ");
		int columns = sc.nextInt();
		int matrix[][] = new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print("enter a[" + (i+1) + "][" + (j+1)  + "]value = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		setMatrixZeroes(matrix);
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
