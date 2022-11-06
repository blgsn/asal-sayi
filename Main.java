
iimport java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
     for(int i=2;i<=100;i++) {//1 is not prime number so Numbers from 2 to 100.
    	 int flag=0;
    	 for(int j=2;j<i;j++) {
    		 if (i%j==0) {//Numbers with divisors other than themselves and 1 are not prime numbers.
    			 flag=1;
    				 break;
    				 }}
    		 if(flag==0) {
        	 
        	 System.out.print(i+" ");//prints prime numbers
    				 }
     }
	 } 
}
