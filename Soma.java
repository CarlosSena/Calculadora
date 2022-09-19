import java.util.Scanner;
import java.io.*;
public class Soma {

	
	
	 public static void main(String[] args) {
		    
		 int op = 0;
		 
		int numA = 20 ;
		 int numB = 10;
	        Scanner sc = new Scanner(System.in);

	      // int numB =1;
			//int numA=1;
			//int num2;
			//int num1;
			//
	        //int control=0;
			Adicao adicao1 = new Adicao(numA, numB);
			Multiplicacao multiplicacao1 = new Multiplicacao(numA, numB);
			Subtracao subtracao1 = new Subtracao(numA, numB);
			Divisao divisao1 = new Divisao(numA, numB);
			//adicao1.somar();
	        
	        //Adicao adicao1 = new Adicao(op, op);
	        //Adicao adicao1 = new Adicao(op, op);
	        //Adicao adicao1 = new Adicao(op, op);
	        
	        
	       // double preco();
	        //Velho velho1 = new Velho("Rua Não sei", 20000.00);
	        
	        

	       
	        //
	        do {

	            System.out.println("1 - Adicao");
	            System.out.println("2 - Subtracao");
	            System.out.println("3 - Multiplicacao");
	            System.out.println("4 - Divisao");
	            System.out.println("0 - Sair \n>>");

	            op = sc.nextInt();
	        
	            
	            
	            switch (op) {
	                case 1:
	                	
	                	//int numB;
	        			//int numA;
	                	 System.out.print("Escreva um numero:");
	            	        numA = sc.nextInt();
	            	        //control++;	
	            	     System.out.print("Escreva outro numero:");
	            	        numB = sc.nextInt();
	            	        //control++;	
	            	        //System.out.println("Escreva outro numero:");
	                	
	            	        adicao1.calcula();
	           	     
	           	        
	           	        
	                    break;

	               
	                case 2:
	                	 System.out.print("Escreva um numero:");
	            	        numA = sc.nextInt();
	            	        //control++;	
	            	     System.out.print("Escreva outro numero:");
	            	        numB = sc.nextInt();
	            	        //control++;	
	            	        //System.out.println("Escreva outro numero:");
	                	
	            	        multiplicacao1.calcula();
	                    break;
	                    
	                case 3:
	                	 System.out.print("Escreva um numero:");
	            	        numA = sc.nextInt();
	            	        //control++;	
	            	     System.out.print("Escreva outro numero:");
	            	        numB = sc.nextInt();
	            	        //control++;	
	            	        //System.out.println("Escreva outro numero:");
	                	
	            	        subtracao1.calcula();
	                    break;
	                    
	                case 4:
	                	 System.out.print("Escreva um numero:");
	            	        numA = sc.nextInt();
	            	        //control++;	
	            	     System.out.print("Escreva outro numero:");
	            	        numB = sc.nextInt();
	            	        //control++;	
	            	        //System.out.println("Escreva outro numero:");
	                	
	            	        divisao1.calcula();
	                    break;
	                    
	              
	                    
	                case 0:
	                	
	                    System.out.println("Saindo...");
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Opção Inválida!");
	            }
	        } while (op != 0);
	    }
	 
	 
	
	
	
}
