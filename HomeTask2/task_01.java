import java.util.Scanner;
public class task_01 {

	public static void main(String[] args) {
//		This program tells you the bonus received by an employee based on his 
//		grade allocation which could either be 101, 102 or 103.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input Employee Grade");
		
		int empl_grade = sc.nextInt();
		
		switch(empl_grade){
		case 101:
			System.out.println("Your employee grade is \t\t:" + empl_grade);
			System.out.println("Your associated bonus is \t:1000" );
			break;
		case 102:
			System.out.println("Your employee grade is \t\t:" + empl_grade);
			System.out.println("Your associated bonus is \t:1500" );
			break;
		case 103:
			System.out.println("Your employee grade is \t\t:" + empl_grade);
			System.out.println("Your associated bonus is \t:2000" );
			break;
		default:
			System.out.println("Wrong/Invalid input");
			System.out.println("Please input one of the following grades 101,102 or 103");
		}
	}

}
