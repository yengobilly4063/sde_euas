
public class task_04 {

	public static void main(String[] args){
//		This program calculates the Average of the elements in the array "student_ages"
		int[] student_ages = {25, 26, 30, 18, 23, 21, 28};
		int sum = 0;
		
		for (int i=0; i<student_ages.length; i++){
//			System.out.println(student_ages[i]);
			sum+=student_ages[i];
//			System.out.println("Current sum of ages = " + sum);
			if (i==(student_ages.length-1)){
//				System.out.println(sum);
//				System.out.println(171/7);
				System.out.println("The average of Student ages (without decimals) is : " + (sum/student_ages.length));
			}
		}
		
	}
}
