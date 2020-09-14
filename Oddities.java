import java.util.Scanner;

public class Oddities {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sci = sc.nextLong();
		for(int i = 0; i< sci; i++) {
			long gi = sc.nextLong();
			
			if(gi == 0) {
				System.out.println("0 is even");
			}else if(gi%2 == 0){
				System.out.println(gi + " is even");
			}else {
				System.out.println(gi + " is odd");
			}
			
		}
	 }
}
