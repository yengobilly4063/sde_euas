package homeTaskLecture2;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args){
		hm_task4();
	}
	/**
	 Write a program in Java to input 3 numbers from keyboard and find their sum and average
	 **/
	
	public static void hm_task4(){
//		This program compute the SUM and Average of any Three(3) number provided
		Scanner cr = new Scanner(System.in);
		System.out.println("Please input Three(3) numbers *Press return key after each");
		
		int num1 = cr.nextInt();
		int num2 = cr.nextInt();
		int num3 = cr.nextInt();
		int[] all_num = {num1, num2, num3}; 
		
		int num_sum = (num1+num2+num3);
		double num_avg = (double)(num1+num2+num3)/all_num.length;
		
		if (num1>0 && num2>0 && num3>0){
			System.out.println("\n\tRESULTS\nSum of Numbers is :" + num_sum + "\nAverage of Numbers is :" + num_avg );
		}else{
			System.out.println("\n\tRESULTS\nSum of Numbers is :" + num_sum + "\nAverage of Numbers is :" + "AT LEAST ONE invalid input found" );
		}
//		I could not account for 
//		1. If more than one negative value was entered.
//		2. If the wrong data type was entered
//		3. HELP PLEASE ???
	}
}
