package Quiz;

import java.util.Scanner;

public class quiz { 
	

	private static Scanner sc;

	public static void main(String[] args) {
		//HOLA
		double N,monto; 
		sc = new Scanner(System.in);  
			      System.out.println("Ingrese monto de compra");  
		      N=sc.nextFloat();  
			      if(N>=500){  
		         monto= N-(N*0.30);  
	          System.out.println(monto);  
		      }else{  
		          if(N <= 500 && N >= 200){  
		             monto = N-(N*0.20);  
		              System.out.println(monto);  
			          }else{ 
			        	  if(N <= 200 && N >= 100){  
					             monto = N-(N*0.10);  
					              System.out.println(monto);  
						          }else{ 
			        	
	          System.out.println(N); 
						          
						          }
			          }
		      }
	}
}

