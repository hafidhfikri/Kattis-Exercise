import java.util.Scanner;

public class TakeTwoStone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long gi = sc.nextLong();

		if(gi == 0) {
			System.out.println("Bob");
		}else if(gi%2 == 0){
			System.out.println("Alice");
		}else {
			System.out.println("Alice");
		}		
		
	 }
}
