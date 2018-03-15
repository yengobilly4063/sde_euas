
public class part2_task_01 {

	public static void main(String[] args){
		String []  weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int [] weekDayTemps = {23, 30, 15, 25, 32, 21, 27};
		
//		THIS BLOCK OF CODE WILL GET THE AVERAGE OF THE TEMPERATURES OF THE WEEK
		int temp_sum = 0;
		for (int i=0; i<weekDayTemps.length; i++){
			temp_sum += weekDayTemps[i];
//			System.out.println("The current sum is " + temp_sum);
		}
		int avg_temp = (temp_sum/weekDayTemps.length);
		System.out.println("The Average temperature is " + avg_temp);
		
		
//		THIS BLOCK OF CODE WILL GET THE HIGHEST AND LOWEST OF THE TEMPERATURES OF THE WEEK
		int max_temp = weekDayTemps[0];
		int indexOfMax = 0;
		int min_temp = weekDayTemps[0];
		int indexOfMin = 0;
		
		for (int i=1; i<weekDayTemps.length; i++){
//			System.out.println(weekDayTemps[i]);
//			HIGHEST TEMP
			if (weekDayTemps[i]>max_temp){
				max_temp = weekDayTemps[i];
				indexOfMax = i;
//				System.out.println("Current max_temp is " + max_temp);
			}
//			LOWEST TEMP
			if (weekDayTemps[i]<min_temp){
				min_temp = weekDayTemps[i];
				indexOfMin = i;
//				System.out.println("Current min_temp is " + min_temp);
			}
			
		}
		
//		System.out.println(indexOfMax);
//		System.out.println(indexOfMin);
		System.out.println();
		System.out.println("The Highest temperature was " + max_temp + "°C, on " + weekDays[indexOfMax]);
		System.out.println("The Lowest temperature was " + min_temp + "°C, on " + weekDays[indexOfMin]);
	
//		GET TEMPERATURES ABOVE THE "avg_temp" VALUE
		System.out.println();
		System.out.println("TEMPERATURES ABOVE THE AVERAGE :");
		for (int i=0; i<weekDayTemps.length; i++){
			if(weekDayTemps[i]>avg_temp){
				System.out.println(weekDayTemps[i] + "°C, on " + weekDays[i]);
			}
		}
		
//		GET TEMPERATURES ABOVE THE "avg_temp" VALUE and create Conversion Table to Fahrenheit
		System.out.println();
		System.out.println("TEMPERATURE TABLE CONVERSION : °C and °F");
		for (int i=0; i<weekDayTemps.length; i++){
				System.out.println(weekDayTemps[i] + "°C, or " + ((int)((weekDayTemps[i]*1.8)+32)) +"°F on " + weekDays[i]);
		}
	}
}
