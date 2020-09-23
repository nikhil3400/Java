import java.util.*;
public class file{

  static int arrayManipulation(int n,int[][] q){
   int a[];
   a=new int[n];
   int m=a[0];
   for(int i=0;i<q.length;i++){
	for(int k=q[i][0]-1;k<q[i][1];k++){
          a[k]+=q[i][2];
          if(a[k]>m)
          m=a[k];
     }
   }
  return m;
}

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int [][] queries = new int[q][3];

   for(int i=0;i<q;i++){
      for(int j=0;j<3;j++){
        queries[i][j]=sc.nextInt();
    }
   }

   long result=arrayManipulation(n,queries);
    System.out.print(result);
 }
}