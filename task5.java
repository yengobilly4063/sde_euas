package homeTaskLecture2;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args){
		hm_task5();
	}
	/**
	 Write a program to print grade of a student using if-else statement. Check the rules for points distribution in the first lecture slides.
	 **/
	public static void hm_task5(){
		Scanner std_grd = new Scanner(System.in);
		System.out.print("Please enter student's grade :");
		
		double student_grade = std_grd.nextDouble();
		int grd1 = 1, grd2 = 2, grd3 = 3, grd4 = 4, grd5 = 5;
		
		if (student_grade<0 || student_grade>100){
			System.out.println("Out of Grade Range *range(0-100)");
			
		}else{
			if(student_grade>=0 && student_grade<=50){
				System.out.println("You FAILED");
				
			}else if(student_grade>50 && student_grade<=60){
				System.out.println("Your Grade : " + grd1);
				
			}else if(student_grade>60 && student_grade<=70){
				System.out.println("Your Grade : " + grd2);
				
			}else if(student_grade>70 && student_grade<=80){
				System.out.println("Your Grade : " + grd3);
				
			}else if(student_grade>80 && student_grade<=90){
				System.out.println("Your Grade : " + grd4);
				
			}else{
				System.out.println("Your Grade : " + grd5);
			}
		}
		
		
	}
}
