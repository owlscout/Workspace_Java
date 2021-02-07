package com.test03;

public class Q1 {

	public static void main(String[] args) {
		
		 int A[][] = new int[3][3]; //1~5 사용
         int V=0; //출력값을 담은 변수
         
        
         for(int i = 0; i < 3; i++){         
             for(int j = 0; j < 3; j++){
                 V = V + 1;
                 A[j][i] = V;               
                           
             }
          
            
         }
        
         for(int i = 0; i < 3; i++){        
             for(int j = 0; j < 3; j++){
                 System.out.print(A[i][j]+"\t");                        
             }
             System.out.println();
         }      
     }


	}

