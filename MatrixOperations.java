package one;

import java.util.Scanner;

public class MatrixOperations { public static void main(String[] args) {
	
	
		
	int m,n;
	Scanner in = new Scanner(System.in);
	
	System.out.println("type 1 for addition & type 2 for multiplication\n\n");
	int st = in.nextInt();
	
	System.out.println("enter nuber of rows and colounms of matrix\n ");
	m = in.nextInt();
	n = in.nextInt();
	
	
	int mat1[][] = new int[m][n];
	int mat2[][] = new int[m][n];
	int res[][] = new int[m][n];
	
	
	
	int i,j;
	
	System.out.println("Enter the elements of matrix1");
	 
	for ( i= 0 ; i < m ; i++ )
	{ 
	 
	for ( j= 0 ; j < n ;j++ )
	mat1[i][j] = in.nextInt();
	 
	System.out.println();
	}
	System.out.println("Enter the elements of matrix2");
	 
	for ( i= 0 ; i < m; i++ )
	{
	 
	for ( j= 0 ; j < n ;j++ )
	mat2[i][j] = in.nextInt();
	System.out.println(); }
	
	
	System.out.println("  \n");
	
	switch(st){
	
	case 1:
		
	 
	for ( i= 0 ; i < m; i++ )
	for ( j= 0 ; j < n;j++ )
	res[i][j] = mat1[i][j] + mat2[i][j] ; 



	System.out.println();
	
	

	System.out.println("Sum of matrices:-");
	 
	for ( i= 0 ; i < m ; i++ )
	{ 
	for ( j= 0 ; j < n ;j++ )
	System.out.print(res[i][j]+"\t");
	 
	System.out.println();
	}
	
	break;
	
	case 2:
		
	
		System.out.println("Matrix multiplication is : \n");
        for(i = 0; i < m; i++) {    
            for( j = 0; j < n; j++){    
              res[i][j]=0;      
              for(int k = 0; k < n; k++){      
                res[i][j] += mat1[i][k] * mat2[k][j];      
              }
              System.out.print(res[i][j] + " ");  
            }
            System.out.println();
        }    
	break;
	
}
	
	}
}
	
	
  

