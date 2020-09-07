import java.util.Scanner;
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row, col, i, j;
		row = sc.nextInt();
		col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int r=0, c=0;
		while(r < row && c < col) {
			for(i=r;i<col;i++) {
				System.out.print(arr[r][i]+" ");
			}
			r++;
			
			for(i=r;i<row;i++) {
				System.out.print(arr[i][col-1]+" ");
			}
			col--;
			
			if(r < row) {
				for(i=col-1;i>=c;i--) {
					System.out.print(arr[row-1][i]+" ");
				}
				row--;
			}
			
			if(c < col) {
				for(i=row-1;i>=r;i--) {
					System.out.print(arr[i][c]+" ");
				}
				c++;
			}
		}
		
	}
}
