import java.util.Scanner;

public class task_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What number of days of the week are we?");
		
		int empl_grade = sc.nextInt();
		
		switch(empl_grade){
		case 1:
			System.out.println("\nToday's day of the week is \t:MONDAY");
			break;
		case 2:
			System.out.println("\nToday's day of the week is \t:Tuesaday");
			break;
		case 3:
			System.out.println("\nToday's day of the week is \t:Wednesday");
			break;
		case 4:
			System.out.println("\nToday's day of the week is \t:Thursday");
			break;
		case 5:
			System.out.println("\nToday's day of the week is \t:Friday");
			break;
		case 6:
			System.out.println("\nToday's day of the week is \t:Saturday");
			break;
		case 7:
			System.out.println("\nToday's day of the week is \t:Sunday");
			break;
		
		default:
			System.out.println("\nWrong/Invalid input");
			System.out.println("Please input one of the following numbers 1-7");
		}
	}

}
