package homeTaskLecture2;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args){
		hm_task1();
	}
	/**
	Write a program to convert a temperature in degrees Fahrenheit to degrees Celsius. The formula for
	conversion is Celsius = (Fahrenheit - 32)*(5/9).
	**/
	public static void hm_task1(){
		//This program takes in your temperature in Fahrenheit and converts it to Celcius
		System.out.println("Temperature Converter \n\tFahrenheit\t::to::\tCelvius\n");
		
		Scanner tp = new Scanner(System.in);
		System.out.print("Input temperature to be converted :");
		
		double temp_Fahrenheit = tp.nextDouble();
		double cst = (double)5/9;
//		System.out.println(cst);
		
		double temp_Celcius = (temp_Fahrenheit - 32)*cst;
		System.out.println("\n\tRESULTS\nTemperature in Fahrenheit : " + temp_Fahrenheit + "\nTemperature in Celcius \t:" + temp_Celcius );

	}		
}
