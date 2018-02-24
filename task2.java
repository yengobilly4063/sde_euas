package homeTaskLecture2;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args){
		hm_task2();
	}
	/**
	 Write a program to convert any amount of euros into any chosen world currency and output your results.
	**/
	public static void hm_task2(){
		//This program converts money/currency from EUROS to US Dolars
		
		Scanner cr = new Scanner(System.in);
		System.out.print("Input Ammount to be converted :€");
		
		double cr_euro = cr.nextDouble();
		double xc_rate = 1.23;
		
		double cr_dollars = (cr_euro * xc_rate);
		if (cr_dollars<=0){
			System.out.println("You must have at least €1");
		}else{
			System.out.println();
			System.out.println("\n\tRESULTS\nMoney in Euros : €" + cr_euro + "\nMoney in Dolars : $" + cr_dollars );
		}
		
	}
}
