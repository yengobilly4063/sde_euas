
public class task_03 {

	public static void main(String[] args) {
//		This program converts money currency from EUROS to US DOLARS
		double exchange_rate = 1.23;
		System.out.println("  EUR \t USD");
		for(int i = 1; i<=10; i++){
			
			System.out.println(i + " EUR \t" + (double)i*exchange_rate);
		}
		
	}

}
