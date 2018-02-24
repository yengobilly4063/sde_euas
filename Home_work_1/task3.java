package homeTaskLecture2;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args){
		hm_task3();
	}
	
	public static void hm_task3(){
		int bun1 = 1000, bun2 = 1500, bun3 = 2000;

		Scanner emp_grd = new Scanner(System.in);
		System.out.print("Input Employee grade (101, 102 or 103):");
		
		int emp_grade = emp_grd.nextInt();
		
		
		if (emp_grade == 101 || emp_grade == 102 || emp_grade == 103 ){
//			System.out.println("START SCREENING");
			if (emp_grade==101){
				System.out.println("\n\tRESULTS\nEmployee Grade :" + emp_grade + "\nEmployee Bonus :" + bun1 );
			}else if(emp_grade==102){
				System.out.println("\n\tRESULTS\nEmployee Grade :" + emp_grade + "\nEmployee Bonus :" + bun2 );
			}else{
				System.out.println("\n\tRESULTS\nEmployee Grade :" + emp_grade + "\nEmployee Bonus :" + bun3 );
			}
		}else{
			System.out.println("Grade not found in RANGE\n");
			System.out.println("Please try again");
			hm_task3();
		}
		
	}
}
