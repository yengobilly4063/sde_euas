import java.util.Scanner;
public class part1_task_01 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String []  weekDays = new String[7];
		int [] weekDayTemps = new int[7];
		
		System.out.println("Please provide highest temperatures of each day of the week (Monday-Sunday)");
		
		for (int i=0; i<7; i++){
			System.out.print("What day of the week is today? ");
			weekDays[i] = sc.next();
			System.out.print("The Highest temperature for " + weekDays[i].toUpperCase() + " is ? ");
			weekDayTemps[i] = sc.nextInt();
		}
		System.out.println("");
		System.out.println("DAY\tHIGHEST TEMPERATURE");
		for(int i=0; i<weekDays.length; i++ ){
			System.out.println(weekDays[i].toUpperCase() + "\t" + weekDayTemps[i] + "°C");
		}
	}
}



