import java.util.Scanner;
public class MatrixMultiplication {
	// multiply the two user given matrix and show the results.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row1,col1,row2,col2,i,j,k;
		Scanner sc = new Scanner(System.in);
		row1 = sc.nextInt(); // rows and column for matrix1 entered by the user. 
		col1 = sc.nextInt();
		
		int mat1[][] = new int[row1][col1];
		for(i=0;i<row1;i++) {
			for(j=0;j<col1;j++) {
				mat1[i][j] = sc.nextInt();  // Scanning the elements of Matrix1.
			}
		}
		
		row2 = sc.nextInt();  // // rows and column for matrix2 entered by the user.
		col2 = sc.nextInt();
		
		int mat2[][] = new int[row2][col2];
		for(i=0;i<row2;i++) {
			for(j=0;j<col2;j++) {
				mat2[i][j] = sc.nextInt();  // Scanning the elements of Matrix2.
			}
		}
		
		int mul[][] = new int[row1][col2]; // Initializing the multiplication matrix.
		//here row1 and col2 is used since we know the the matrix obtained by multiplication has same number of rows as first matrix
		//and same number of columns as second matrix.
		
		for(i=0;i<row1;i++) {
			for(j=0;j<col2;j++) {
				for(k=0;k<col1;k++) {
					mul[i][j] += mat1[i][k] * mat2[k][j]; // Method of matrix multiplication.
					// here variable k is used for both mat1 and mat2 as one of the condition for matrix multiplication is
					// that number of columns of matrix 1 should be equal to number of columns in matrix 2.
				}
			}
		}

		
		for(i=0;i<row1;i++) {
			for(j=0;j<col2;j++) {
				System.out.print(mul[i][j] + " "); // Printing the obtained Matrix.
			}
			System.out.println();
		}
	}
}
